package com.test.myproject.presentation.screens.login

import com.test.myproject.presentation.base.BaseHandler
import com.test.myproject.presentation.base.GlobalProperties
import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage
import com.test.myproject.presentation.screens.main.MainScreen
import com.test.myproject.presentation.screens.register.RegisterScreen

class LoginScreenHandler :
    BaseHandler<
            LoginScreenViewModel,
            LoginScreenContract.Effect>() {

    override fun handleEffects(
        effect: LoginScreenContract.Effect, viewModel: LoginScreenViewModel
    ) {

        when (effect) {
            is LoginScreenContract.Effect.ErrorPage -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = ErrorScreenMessage(effect.message, effect.event),
                        isLoading = false,
                    )
                }
            }

            LoginScreenContract.Effect.Loading -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = true,
                    )
                }
            }

            LoginScreenContract.Effect.Nothing -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = false,
                    )
                }
            }

            is LoginScreenContract.Effect.ShowToast -> {
                viewModel.setState {
                    copy(
                        toastMessage = effect.message,
                        errorScreen = null,
                        isLoading = false,
                    )
                }

            }

            is LoginScreenContract.Effect.Navigation.Register -> {
                RegisterScreen(effect.email).show(true)
            }

            LoginScreenContract.Effect.Navigation.Main -> {
//                GlobalProperties.personDetails = effect.person
                viewModel.setLogin()
                MainScreen(
                    viewModel.loginIdentity.value,
                ).show(true)
            }

            is LoginScreenContract.Effect.SuccessGetLoginApi -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = false,
                        responseLoginApi = effect.response
                    )
                }

                for (node in effect.response.ui.nodes) {

                    if (node.meta?.label?.text == "E-Mail") {
                        GlobalProperties.isTypeLoginEmail = true
                        break
                    }

                    if (node.meta?.label?.text == "Username") {
                        GlobalProperties.isTypeLoginEmail = false
                        break
                    }
                }


                viewModel.setEvent(LoginScreenContract.Event.CheckLogin)
            }

            is LoginScreenContract.Effect.SuccessLogin -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = false,
                        responseLogin = effect.response
                    )
                }

                if (effect.response.session_token != null) {
                    viewModel.setEffect { LoginScreenContract.Effect.Navigation.Main }
                } else {
                    effect.response.ui?.nodes?.forEach { node ->
                        node.messages.forEach { message ->
                            viewModel.setEffect { LoginScreenContract.Effect.ShowToast(message.text) }
                        }
                    }
                }


            }
        }


    }

}