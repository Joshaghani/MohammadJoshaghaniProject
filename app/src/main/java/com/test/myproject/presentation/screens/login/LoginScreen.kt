package com.test.myproject.presentation.screens.login

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
import com.test.myproject.presentation.root.screenSize
import com.test.myproject.presentation.utilities.validation.isValidEmailAddress
import com.test.myproject.presentation.utilities.validation.isValidPassword
import com.test.myproject.presentation.components.textFieldTheme.TextFieldWithTitle
import com.test.myproject.presentation.components.textFieldTheme.TypeInputTextField
import com.test.myproject.presentation.utilities.validation.isValidUserName

class LoginScreen(
    email: String? = null,
    override var handler: BaseHandler<LoginScreenViewModel, LoginScreenContract.Effect> = LoginScreenHandler()
) :
    BaseScreen<LoginScreenContract.State,
            LoginScreenContract.Event,
            LoginScreenContract.Effect,
            LoginScreenViewModel>(
        LoginScreenViewModel::class.java
    ) {


    init {
        email?.let {
            onEventSent(LoginScreenContract.Event.SetEmailText(email))
        }
    }


    @Composable
    override fun ComposeView(
        state: LoginScreenContract.State,
    ) {

        val focusRequesterEmail = remember { FocusRequester() }
        val focusRequesterPassword = remember { FocusRequester() }

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

            Spacer(modifier = Modifier.height((screenSize.value.second / 16).dp))

            BorderCard {

                TextFieldWithTitle(
                    title = "آدرس ایمیل یا نام کاربری",
                    maxLength = 100,
                    text = viewModel.loginIdentity,
                    inputType = TypeInputTextField.TEXT,
                    imeAction = ImeAction.Next,
                    modifier = Modifier.focusRequester(focusRequesterEmail),
                    keyboardActions = KeyboardActions {
                        focusRequesterPassword.requestFocus()
                    },
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
                        onEventSent(LoginScreenContract.Event.Login)
                    })

                Spacer(modifier = Modifier.height(20.dp))

                ITextButton("هنوز ثبت نام نکرده اید؟") {
                    onEventSent(LoginScreenContract.Event.GoToRegister)
                }


                OnBackgroundButton(
                    "ورود به حساب کاربری",
                    iconPainter = painterResource(R.drawable.ic_send_login)
                ) {
                    onEventSent(LoginScreenContract.Event.Login)
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
