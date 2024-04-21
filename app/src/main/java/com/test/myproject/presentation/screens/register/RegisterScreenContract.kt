package com.test.myproject.presentation.screens.register

import com.test.myproject.data.database.room.entities.Person
import com.test.myproject.domain.IApiResponse
import com.test.myproject.domain.IResponse
import com.test.myproject.presentation.base.ViewEvent
import com.test.myproject.presentation.base.ViewSideEffect
import com.test.myproject.presentation.base.ViewState
import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage

class RegisterScreenContract {

    sealed class Event : ViewEvent {

        data object GetRegisterApi : Event()

        data class SetEmailText(val email: String) : Event()

        data object GoToLoginScreen : Event()

        data object Register : Event()
    }

    data class State(
        override var errorScreen: ErrorScreenMessage<Event>? = null,
        override var isLoading: Boolean = true,
        override var toastMessage: String? = null,
        var responseRegister: IResponse? = null,
        var responseRegisterApi: IApiResponse? = null,
    ) : ViewState<Event>

    sealed class Effect : ViewSideEffect {

        data class ShowToast(val message: String) : Effect()
        data object Loading : Effect()
        data object Nothing : Effect()
        data class ErrorPage(val message: String, val event: Event) : Effect()

        data class SuccessGetRegister(val IResponse: IResponse) : Effect()

        data class SuccessGetResgisterApi(val response: IApiResponse) : Effect()

        sealed class Navigation : Effect() {
            data object Back : Navigation()

            data class LoginScreen(val email: String) : Navigation()
            data class MainScreen(val person: Person) : Navigation()
        }
    }

}