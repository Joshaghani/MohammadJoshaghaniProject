package com.test.myproject.presentation.screens.login

import androidx.compose.runtime.mutableStateOf
import com.test.myproject.data.database.repository.LoginRepository
import com.test.myproject.data.managers.LoginService
import com.test.myproject.presentation.base.BaseViewModel
import com.test.myproject.presentation.screens.login.dto.LoginInputDto
import com.test.myproject.presentation.screens.login.reduce.reduceLogin
import com.test.myproject.presentation.utilities.LoginState
import com.test.myproject.presentation.utilities.dataTrasnferObject.ValidationState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject
import kotlin.math.log

@HiltViewModel
class LoginScreenViewModel
@Inject constructor(
    private val repository: LoginRepository,
    private val service: LoginService
) : BaseViewModel<LoginScreenContract.Event, LoginScreenContract.State, LoginScreenContract.Effect>() {


    @Inject
    lateinit var loginState: LoginState

    var loginIdentity = mutableStateOf("")

    var password = mutableStateOf("")

    enum class TypeRequests(val type: LoginScreenContract.Event) {
        LOGIN(LoginScreenContract.Event.CheckLogin),
        LOGIN_API(LoginScreenContract.Event.GetLoginApi)
    }

    override fun initViewModel() {
        handleEvents(LoginScreenContract.Event.GetLoginApi)
    }

    fun setLogin() {
        loginState.setLogin(loginIdentity.value, password.value)
    }

    override fun setInitialState() = LoginScreenContract.State()


    override fun handleEvents(event: LoginScreenContract.Event) {
        when (event) {
            LoginScreenContract.Event.Login -> {

                LoginInputDto(
                    loginIdentity = loginIdentity.value,
                    passwordText = password.value,
                ).validate {
                    when (this) {
                        is ValidationState.Error -> {
                            setEffect { LoginScreenContract.Effect.ShowToast(message) }
                        }

                        is ValidationState.Validate -> {

                            launchOnScope {

                                service.login(model, viewState.value.responseLoginApi!!.id)
                                    .collectLatest {
                                        setEffect { it.reduceLogin() }
                                    }

                                /*  repository.checkLogin(
                                      email = email.value,
                                      password = password.value
                                  ) { response ->
                                      when (response) {
                                          is ResponseDb.Message -> {
                                              setEffect {
                                                  LoginScreenContract.Effect.ShowToast(response.message)
                                              }
                                          }

                                          is ResponseDb.Success -> {
                                              setEffect {
                                                  LoginScreenContract.Effect.Navigation.Main(
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

            LoginScreenContract.Event.CheckLogin -> {

                val modelLogin = loginState.isLogin()

                if (modelLogin != null) {
                    loginIdentity.value = modelLogin.email
                    password.value = modelLogin.password
                    handleEvents(LoginScreenContract.Event.Login)
                } else {
                    setState {
                        copy(isLoading = false)
                    }
                }

            }

            LoginScreenContract.Event.GoToRegister -> {
                setEffect { LoginScreenContract.Effect.Navigation.Register(loginIdentity.value) }
            }

            is LoginScreenContract.Event.SetEmailText -> {
                loginIdentity.value = event.email
            }

            LoginScreenContract.Event.GetLoginApi -> {
                launchOnScope {
                    service.loginApi().collectLatest {
                        setEffect { it.reduceLogin() }
                    }
                }
            }
        }
    }

}