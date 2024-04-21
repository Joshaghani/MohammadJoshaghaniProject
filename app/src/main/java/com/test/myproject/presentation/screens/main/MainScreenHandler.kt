package com.test.myproject.presentation.screens.main

import com.test.myproject.presentation.base.BaseHandler
import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage
import javax.inject.Singleton

@Singleton
class MainScreenHandler :
    BaseHandler<MainScreenViewModel, MainScreenContract.Effect>() {

    override fun handleEffects(effect: MainScreenContract.Effect, viewModel: MainScreenViewModel) {
        when (effect) {

            is MainScreenContract.Effect.ErrorPage -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = ErrorScreenMessage(effect.message, effect.typeRequest),
                        isLoading = false,
                    )
                }
            }

            MainScreenContract.Effect.Loading -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = true,
                    )
                }
            }

            MainScreenContract.Effect.Nothing -> {
                viewModel.setState {
                    copy(
                        toastMessage = null,
                        errorScreen = null,
                        isLoading = false,
                    )
                }
            }

            is MainScreenContract.Effect.ShowToast -> {
                viewModel.setState {
                    copy(
                        toastMessage = effect.message,
                        errorScreen = null,
                        isLoading = false,
                    )
                }
            }

            MainScreenContract.Effect.Navigation.Back -> {

            }
        }
    }


}