package com.test.myproject.presentation.screens.splash

import android.os.Handler
import android.os.Looper
import com.test.myproject.data.managers.SplashService
import com.test.myproject.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class SplashScreenViewModel
@Inject
constructor(
    private val service: SplashService
) : BaseViewModel<
        SplashScreenContract.Event,
        SplashScreenContract.State,
        SplashScreenContract.Effect
        >() {


    override fun setInitialState(): SplashScreenContract.State {
        return SplashScreenContract.State(
            toastMessage = null,
            errorScreen = null,
            isLoading = false
        )
    }

    override fun initViewModel() {

        Handler(Looper.myLooper()!!).postDelayed({
            handleEvents(SplashScreenContract.Event.GoToLoginScreen)
        }, 1500)

    }

    override fun handleEvents(event: SplashScreenContract.Event) {

        when (event) {
            SplashScreenContract.Event.GoToLoginScreen -> {
                setEffect {
                    SplashScreenContract.Effect.Navigation.LoginScreen
                }
            }
        }

    }


}