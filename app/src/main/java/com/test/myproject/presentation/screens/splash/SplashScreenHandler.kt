package com.test.myproject.presentation.screens.splash

import com.test.myproject.presentation.base.BaseHandler
import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage
import com.test.myproject.presentation.screens.login.LoginScreen
import com.test.myproject.presentation.screens.main.MainScreen
import javax.inject.Named
import javax.inject.Singleton


class SplashScreenHandler :
    BaseHandler<
            SplashScreenViewModel,
            SplashScreenContract.Effect>() {

    override fun handleEffects(
        effect: SplashScreenContract.Effect,
        viewModel: SplashScreenViewModel
    ) {
        when (effect) {
            is SplashScreenContract.Effect.ErrorPage -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = ErrorScreenMessage(effect.message, effect.event),
                        isLoading = false,
                    )
                }
            }

            SplashScreenContract.Effect.Loading -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = true,
                    )
                }
            }


            SplashScreenContract.Effect.Nothing -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = false,
                    )
                }
            }

            is SplashScreenContract.Effect.ShowToast -> viewModel.setState {
                copy(
                    toastMessage = effect.message,
                    errorScreen = null,
                    isLoading = false,
                )
            }

            SplashScreenContract.Effect.Navigation.LoginScreen -> {
                LoginScreen().show(true)
            }
        }
    }


}