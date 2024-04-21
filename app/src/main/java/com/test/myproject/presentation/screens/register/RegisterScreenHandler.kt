package com.test.myproject.presentation.screens.register

import com.test.myproject.presentation.base.BaseHandler
import com.test.myproject.presentation.base.GlobalProperties
import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage
import com.test.myproject.presentation.screens.login.LoginScreen
import com.test.myproject.presentation.screens.main.MainScreen

class RegisterScreenHandler :
    BaseHandler<RegisterScreenViewModel, RegisterScreenContract.Effect>() {
    override fun handleEffects(
        effect: RegisterScreenContract.Effect, viewModel: RegisterScreenViewModel
    ) {

        when (effect) {
            is RegisterScreenContract.Effect.ErrorPage -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = ErrorScreenMessage(effect.message, effect.event),
                        isLoading = false,
                    )
                }
            }

            RegisterScreenContract.Effect.Loading -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = true,
                    )
                }
            }

            RegisterScreenContract.Effect.Nothing -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = false,
                    )
                }
            }

            is RegisterScreenContract.Effect.ShowToast -> {
                viewModel.setState {
                    copy(
                        toastMessage = effect.message,
                        errorScreen = null,
                        isLoading = false,
                    )
                }

            }

            RegisterScreenContract.Effect.Navigation.Back -> {
            }

            is RegisterScreenContract.Effect.Navigation.LoginScreen -> {
                LoginScreen(email = effect.email).show(true)
            }

            is RegisterScreenContract.Effect.Navigation.MainScreen -> {
//                GlobalProperties.personDetails = effect.person
                viewModel.setLogin()
                MainScreen(
                    viewModel.loginIdentity.value,
                ).show(true)
            }

            is RegisterScreenContract.Effect.SuccessGetRegister -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = false,
                        responseRegister = effect.IResponse
                    )
                }

                if (effect.IResponse.session_token != null) {
                    viewModel.setLogin()
                    MainScreen(
                        viewModel.loginIdentity.value,
                    ).show(true)
                } else {
                    effect.IResponse.ui?.nodes?.forEach { node ->
                        node.messages.forEach { message ->
                            viewModel.setEffect { RegisterScreenContract.Effect.ShowToast(message.text) }
                        }
                    }
                }

            }

            is RegisterScreenContract.Effect.SuccessGetResgisterApi -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = false,
                        responseRegisterApi = effect.response
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


            }
        }

    }


}