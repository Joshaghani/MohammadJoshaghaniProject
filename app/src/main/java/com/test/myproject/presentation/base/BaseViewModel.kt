package com.test.myproject.presentation.base

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

interface ViewEvent

interface ViewSideEffect

abstract class BaseViewModel<Event : ViewEvent, UiState : ViewState<Event>, Effect : ViewSideEffect> :
    ViewModel() {

    abstract fun initViewModel()
    abstract fun setInitialState(): UiState
    abstract fun handleEvents(event: Event)

    private val initialState: UiState by lazy { setInitialState() }

    private val _viewState: MutableState<UiState> = mutableStateOf(initialState)
    val viewState: State<UiState> = _viewState

    private val _event: MutableSharedFlow<Event> = MutableSharedFlow()

    private var _effect: Channel<Effect> = Channel()
    var effect = _effect.receiveAsFlow()

    fun launchOnScope(block: suspend CoroutineScope.() -> Unit) {
        viewModelScope.launch { block() }
    }

    init {
        subscribeToEvents()
    }

    private fun subscribeToEvents() {
        launchOnScope {
            _event.collect { handleEvents(it) }
        }
    }

    fun setEvent(event: Event) {
        launchOnScope { _event.emit(event) }
    }

    fun setState(reducer: UiState.() -> UiState) {
        val newState = viewState.value.reducer()
        _viewState.value = newState
    }

    fun setEffect(builder: () -> Effect) {
        val effectValue = builder()
        launchOnScope { _effect.send(effectValue) }
    }

}