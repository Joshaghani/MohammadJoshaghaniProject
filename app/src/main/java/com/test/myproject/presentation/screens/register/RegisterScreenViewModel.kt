package com.test.myproject.presentation.screens.register

import androidx.compose.runtime.mutableStateOf
import com.test.myproject.R
import com.test.myproject.data.database.repository.RegisterRepository
import com.test.myproject.data.managers.RegisterService
import com.test.myproject.presentation.base.BaseViewModel
import com.test.myproject.presentation.base.GlobalProperties
import com.test.myproject.presentation.screens.register.dto.RegisterInputDtoEmail
import com.test.myproject.presentation.screens.register.dto.RegisterInputDtoUsername
import com.test.myproject.presentation.screens.register.reduce.reduceRegister
import com.test.myproject.presentation.utilities.LoginState
import com.test.myproject.presentation.utilities.dataTrasnferObject.ValidationState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject


@HiltViewModel
class RegisterScreenViewModel
@Inject
constructor(
    private val repository: RegisterRepository,
    private val service: RegisterService
) : BaseViewModel<
        RegisterScreenContract.Event,
        RegisterScreenContract.State,
        RegisterScreenContract.Effect,
        >() {

    @Inject
    lateinit var loginState: LoginState

    var loginIdentity = mutableStateOf("")
    var fullName = mutableStateOf("")

    var password = mutableStateOf("")
    var repeatPassword = mutableStateOf("")


    fun setLogin() {
        loginState.setLogin(loginIdentity.value, password.value)
    }


    enum class TypeRequests(val type: RegisterScreenContract.Event) {
        REGISTER_API(RegisterScreenContract.Event.GetRegisterApi),
        REGISTER(RegisterScreenContract.Event.Register),
    }

    override fun initViewModel() {
        handleEvents(RegisterScreenContract.Event.GetRegisterApi)
    }

    override fun setInitialState() = RegisterScreenContract.State()

    override fun handleEvents(event: RegisterScreenContract.Event) {

        when (event) {
            is RegisterScreenContract.Event.SetEmailText -> {
                loginIdentity.value = event.email
            }

            RegisterScreenContract.Event.GoToLoginScreen -> {
                setEffect {
                    RegisterScreenContract.Effect.Navigation.LoginScreen(loginIdentity.value)
                }
            }

            RegisterScreenContract.Event.Register -> {

                if (GlobalProperties.isTypeLoginEmail) {
                    registerWithEmail()
                } else {
                    registerWithUsername()
                }

            }


            RegisterScreenContract.Event.GetRegisterApi -> {
                launchOnScope {
                    service.registerApi().collectLatest {
                        setEffect { it.reduceRegister() }
                    }
                }
            }
        }

    }

    private fun registerWithEmail() {
        RegisterInputDtoEmail(
            loginIdentity = loginIdentity.value,
            passwordText = password.value,
            fullName = fullName.value,
            repeatPasswordText = repeatPassword.value,
        ).validate {
            when (this) {
                is ValidationState.Error -> {
                    setEffect {
                        RegisterScreenContract.Effect.ShowToast(message)
                    }
                }

                is ValidationState.Validate -> {

                    launchOnScope {

                        service.registerWithEmail(
                            model,
                            viewState.value.responseRegisterApi!!.id
                        )
                            .collectLatest {
                                setEffect { it.reduceRegister() }
                            }

                        /*  repository.checkRegister(
                              email = email.value,
                              password = password.value,
                              fullName = fullName.value
                          ) { response ->
                              when (response) {
                                  is ResponseDb.Message -> setEffect {
                                      RegisterScreenContract.Effect.ShowToast(
                                          response.message
                                      )
                                  }

                                  is ResponseDb.Success -> {
                                      setEffect {
                                          RegisterScreenContract.Effect.Navigation.MainScreen(
                                              response.row
                                          )
                                      }
                                  }
                              }
                          }*/
                    }


                }
            }
        }
    }

    private fun registerWithUsername() {
        RegisterInputDtoUsername(
            loginIdentity = loginIdentity.value,
            passwordText = password.value,
            fullName = fullName.value,
            repeatPasswordText = repeatPassword.value,
        ).validate {
            when (this) {
                is ValidationState.Error -> {
                    setEffect {
                        RegisterScreenContract.Effect.ShowToast(message)
                    }
                }

                is ValidationState.Validate -> {

                    launchOnScope {

                        service.registerWithUsername(
                            model,
                            viewState.value.responseRegisterApi!!.id
                        )
                            .collectLatest {
                                setEffect { it.reduceRegister() }
                            }

                    }


                }
            }
        }
    }


}