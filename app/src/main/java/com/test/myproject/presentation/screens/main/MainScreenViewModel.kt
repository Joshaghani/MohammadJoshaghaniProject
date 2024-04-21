package com.test.myproject.presentation.screens.main

import com.test.myproject.data.managers.MainService
import com.test.myproject.presentation.base.BaseViewModel
import com.test.myproject.presentation.utilities.LoginState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainScreenViewModel
@Inject
constructor(
    private val service: MainService
) : BaseViewModel<MainScreenContract.Event, MainScreenContract.State, MainScreenContract.Effect>() {

    @Inject
    lateinit var loginState: LoginState

    enum class TypeRequests(val type: MainScreenContract.Event) {

    }

    override fun initViewModel() {
    }

    override fun setInitialState() = MainScreenContract.State()

    override fun handleEvents(event: MainScreenContract.Event) {
        when (event) {
            MainScreenContract.Event.Logout -> {
                loginState.logout()
            }
        }
    }


}