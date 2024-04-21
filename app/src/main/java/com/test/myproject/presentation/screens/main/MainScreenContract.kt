package com.test.myproject.presentation.screens.main

import com.test.myproject.presentation.base.ViewEvent
import com.test.myproject.presentation.base.ViewSideEffect
import com.test.myproject.presentation.base.ViewState
import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage

class MainScreenContract {

    sealed class Event : ViewEvent {

        data object Logout : Event()

    }

    data class State(
        override var errorScreen: ErrorScreenMessage<Event>? = null,
        override var isLoading: Boolean = false,
        override var toastMessage: String? = null,
    ) : ViewState<Event>

    sealed class Effect : ViewSideEffect {

        data class ShowToast(val message: String) : Effect()
        data object Loading : Effect()
        data object Nothing : Effect()
        data class ErrorPage(val message: String, val typeRequest: Event) : Effect()

        sealed class Navigation : Effect() {
            data object Back : Navigation()
        }
    }
}