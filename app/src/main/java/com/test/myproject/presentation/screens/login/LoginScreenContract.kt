package com.test.myproject.presentation.screens.login

import com.test.myproject.data.database.room.entities.Person
import com.test.myproject.domain.IApiResponse
import com.test.myproject.domain.IResponse
import com.test.myproject.presentation.base.ViewEvent
import com.test.myproject.presentation.base.ViewSideEffect
import com.test.myproject.presentation.base.ViewState
import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage

class LoginScreenContract {
    sealed class Event : ViewEvent {

        data object GetLoginApi : Event()

        data object CheckLogin : Event()
        data object Login : Event()

        data object GoToRegister : Event()
        data class SetEmailText(val email: String) : Event()

    }

    data class State(
        override var errorScreen: ErrorScreenMessage<Event>? = null,
        override var isLoading: Boolean = true,
        override var toastMessage: String? = null,
        var responseLoginApi: IApiResponse? = null,
        var responseLogin: IResponse? = null,
    ) : ViewState<Event>

    sealed class Effect : ViewSideEffect {

        data class ShowToast(val message: String) : Effect()
        data object Loading : Effect()
        data object Nothing : Effect()
        data class ErrorPage(val message: String, val event: Event) : Effect()


        data class SuccessGetLoginApi(val response: IApiResponse) : Effect()
        data class SuccessLogin(val response: IResponse) : Effect()

        sealed class Navigation : Effect() {

            data class Register(val email: String) : Navigation()
            data object Main : Navigation()

        }
    }
}