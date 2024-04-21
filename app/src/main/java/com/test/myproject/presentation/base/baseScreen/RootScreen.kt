package com.test.myproject.presentation.base.baseScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.test.myproject.presentation.base.BaseHandler
import com.test.myproject.presentation.base.BaseViewModel
import com.test.myproject.presentation.base.GlobalProperties
import com.test.myproject.presentation.base.Navigator
import com.test.myproject.presentation.base.ShowBottombar
import com.test.myproject.presentation.base.ViewEvent
import com.test.myproject.presentation.base.ViewSideEffect
import com.test.myproject.presentation.base.ViewState
import com.test.myproject.presentation.components.ISampleDialog
import com.test.myproject.presentation.components.errorScreen.ErrorPageScreen
import com.test.myproject.presentation.root.showSnackbar
import com.test.myproject.presentation.screens.login.LoginScreen
import com.test.myproject.presentation.screens.main.MainScreen
import com.test.myproject.presentation.screens.register.RegisterScreen
import com.test.myproject.presentation.screens.splash.SplashScreen
import com.test.myproject.presentation.utilities.restartApplication
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach


abstract class RootScreen<State : ViewState<Event>, Event : ViewEvent, Effect : ViewSideEffect, VM : BaseViewModel<Event, State, Effect>>(
    private val modelClass: Class<VM>

) {

    abstract var handler: BaseHandler<VM, Effect>

    @Composable
    abstract fun ComposeView(state: State)

    var scrollPosition: MutableState<Int> = mutableStateOf(0)

    val viewModel: VM by lazy {
        ViewModelProvider(GlobalProperties.currentActivity)[modelClass]
    }

    var onEventSent = { event: Event ->
        viewModel.setEvent(event)
    }


    @Composable
    abstract fun ShowCompose()

    @Composable
    fun ShowCompose(screen: IScreen<State, Event>) {

        viewModel.launchOnScope {
            viewModel.effect.onEach {
                handler.handleEffects(it, viewModel)
            }.collect()
        }

        if (viewModel.viewState.value.isLoading) {
            Box(
                Modifier.fillMaxSize(), contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }

        } else if (viewModel.viewState.value.errorScreen != null) {
            ErrorPageScreen(message = viewModel.viewState.value.errorScreen!!.message,
                event = viewModel.viewState.value.errorScreen!!.event,
                retryClick = {
                    viewModel.handleEvents(it)
                })

        } else {

            screen.SetScreen(viewModel.viewState.value)

            if (viewModel.viewState.value.toastMessage != null) {
                showSnackbar(viewModel.viewState.value.toastMessage!!)
                viewModel.viewState.value.toastMessage = null
            }

        }

    }


    @Composable
    fun ComposeUI(
        state: State,
    ) {
        ComposeView(state = state)
    }

    fun show(replace: Boolean = false) {
        if (this is MainScreen || this is LoginScreen || this is RegisterScreen || this is SplashScreen) {
            Navigator.clear()
        }
        if (replace) {
            Navigator.remove(Navigator.currentScreen.value!!)
        }
        Navigator.add(this)
        viewModel.initViewModel()
    }

    fun onRestart() {
        viewModel.initViewModel()
    }

    fun onBackPressed(backFromDialog: Boolean = false): Boolean {

        if (backFromDialog) {
            ISampleDialog.getDialog()?.onDismissRequest()
            return Navigator.remove(this)
        }

        if (ISampleDialog.isShow()) {
            ISampleDialog.getDialog()?.onDismissRequest()
            return true
        }

        return Navigator.remove(this)
    }

    fun showBottombar() = this is ShowBottombar

    @Composable
    fun ResetApp() {
        Navigator.clear()
        ISampleDialog.getDialog()?.onDismissRequest()

        restartApplication(GlobalProperties.currentActivity)
    }

}
