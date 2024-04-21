package com.test.myproject.presentation.screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.test.myproject.R
import com.test.myproject.presentation.base.BaseHandler
import com.test.myproject.presentation.base.GlobalProperties
import com.test.myproject.presentation.base.baseScreen.BaseScreen
import com.test.myproject.presentation.components.BorderCard
import com.test.myproject.presentation.components.ITextButton
import com.test.myproject.presentation.components.OnBackgroundButton
import com.test.myproject.presentation.root.Res
import com.test.myproject.presentation.utilities.validation.getMessageErrorPassword
import com.test.myproject.presentation.utilities.validation.isValidEmailAddress
import com.test.myproject.presentation.utilities.validation.isValidPassword
import com.test.myproject.presentation.utilities.validation.isValidRepeatPassword
import com.test.myproject.presentation.components.textFieldTheme.TextFieldWithTitle
import com.test.myproject.presentation.components.textFieldTheme.TypeInputTextField
import com.test.myproject.presentation.utilities.validation.isValidUserName


class RegisterScreen(
    email: String,
    override var handler: BaseHandler<RegisterScreenViewModel, RegisterScreenContract.Effect> = RegisterScreenHandler()
) : BaseScreen<
        RegisterScreenContract.State,
        RegisterScreenContract.Event,
        RegisterScreenContract.Effect,
        RegisterScreenViewModel
        >(
    RegisterScreenViewModel::class.java
) {

    init {
        onEventSent(RegisterScreenContract.Event.SetEmailText(email))
    }

    @Composable
    override fun ComposeView(state: RegisterScreenContract.State) {


        val focusRequesterEmail = remember { FocusRequester() }
        val focusRequesterFullName = remember { FocusRequester() }
        val focusRequesterPassword = remember { FocusRequester() }
        val focusRequesterRepeatPassword = remember { FocusRequester() }

        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .imePadding()
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
                .height(IntrinsicSize.Max)
                .verticalScroll(rememberScrollState())
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 32.dp, end = 32.dp)

            ) {

                Spacer(modifier = Modifier.height(56.dp))

                Image(
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(0.6f),
                )
            }

            Spacer(modifier = Modifier.height(56.dp))

            BorderCard {

                TextFieldWithTitle(
                    title = if (GlobalProperties.isTypeLoginEmail) "آدرس ایمیل" else "نام کاربری",
                    isError = isValidEmailAddress(viewModel.loginIdentity.value, true),
                    placeholder = if (GlobalProperties.isTypeLoginEmail) "آدرس ایمیل را وارد کنیدس" else "نام کاربری را وارد کنید",
                    maxLength = 100,
                    text = viewModel.loginIdentity,
                    inputType = TypeInputTextField.TEXT,
                    imeAction = ImeAction.Next,
                    modifier = Modifier.focusRequester(focusRequesterEmail),
                    keyboardActions = KeyboardActions {
                        focusRequesterPassword.requestFocus()
                    },
                    showErrorText =
                    if (GlobalProperties.isTypeLoginEmail) isValidEmailAddress(
                        viewModel.loginIdentity.value,
                        true
                    )
                    else isValidUserName(viewModel.loginIdentity.value, true),
                    textErrorText =
                    if (GlobalProperties.isTypeLoginEmail)
                        Res.string.error_input_email
                    else
                        Res.string.error_input_username
                )



                TextFieldWithTitle(
                    title = "رمز عبور",
                    placeholder = "رمز عبور خود را وارد کنید",
                    isError = !isValidPassword(viewModel.password.value, true),
                    text = viewModel.password,
                    inputType = TypeInputTextField.PASSWORD,
                    imeAction = ImeAction.Done,
                    modifier = Modifier.focusRequester(focusRequesterPassword),
                    showErrorText = !isValidPassword(viewModel.password.value, true),
                    textErrorText = Res.string.error_input_password,
                    keyboardActions = KeyboardActions {
                        focusRequesterRepeatPassword.requestFocus()
                    })

                TextFieldWithTitle(
                    title = "تکرار رمز عبور",
                    placeholder = "تکرار رمز عبور خود را وارد کنید",
                    isError = !isValidRepeatPassword(
                        viewModel.password.value,
                        viewModel.repeatPassword.value,
                        true
                    ),
                    text = viewModel.repeatPassword,
                    inputType = TypeInputTextField.PASSWORD,
                    imeAction = ImeAction.Done,
                    modifier = Modifier.focusRequester(focusRequesterPassword),
                    showErrorText = !isValidRepeatPassword(
                        viewModel.password.value,
                        viewModel.repeatPassword.value,
                        true
                    ),
                    textErrorText = getMessageErrorPassword(
                        viewModel.password.value,
                        viewModel.repeatPassword.value,
                        true
                    ),
                    keyboardActions = KeyboardActions {
                        onEventSent(RegisterScreenContract.Event.Register)
                    })

                Spacer(modifier = Modifier.height(20.dp))

                ITextButton("ورود به حساب کاربری") {
                    onEventSent(RegisterScreenContract.Event.GoToLoginScreen)
                }


                OnBackgroundButton(
                    "ثبت نام",
                    iconPainter = painterResource(R.drawable.ic_send_login)
                ) {
                    onEventSent(RegisterScreenContract.Event.Register)
                }

            }

            Spacer(modifier = Modifier.size(56.dp))

        }

        DisposableEffect(Unit) {
            focusRequesterEmail.requestFocus()
            onDispose {}
        }


    }


}