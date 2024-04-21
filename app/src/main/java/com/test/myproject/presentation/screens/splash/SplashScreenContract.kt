package com.test.myproject.presentation.screens.splash

import com.test.myproject.presentation.base.ViewEvent
import com.test.myproject.presentation.base.ViewSideEffect
import com.test.myproject.presentation.base.ViewState
import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage

class SplashScreenContract {

    sealed class Event : ViewEvent {

        data object GoToLoginScreen : Event()
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
        data class ErrorPage(val message: String, val event: Event) : Effect()

        sealed class Navigation : Effect() {
            data object LoginScreen : Navigation()
        }
    }

}