package com.test.myproject.presentation.screens.register.dto

import com.test.myproject.domain.register.RegisterInputEmail
import com.test.myproject.domain.register.TraitsEmail
import com.test.myproject.presentation.root.Res
import com.test.myproject.presentation.utilities.dataTrasnferObject.ValidationService
import com.test.myproject.presentation.utilities.dataTrasnferObject.ValidationState
import com.test.myproject.presentation.utilities.validation.isValidEmailAddress

data class RegisterInputDtoEmail(
    val loginIdentity: String = "",
    val fullName: String = "",
    val passwordText: String = "",
    val repeatPasswordText: String = "",
) : ValidationService<RegisterInputDtoEmail, RegisterInputEmail> {

    override fun validate(block: ValidationState<RegisterInputEmail>.() -> Unit) {

        if (loginIdentity.isEmpty()) {
            block(ValidationState.Error(Res.string.empty_input_email))

        } else if (isValidEmailAddress(loginIdentity)) {
            block(ValidationState.Error(Res.string.error_input_email))

        } else if (passwordText.isEmpty()) {
            block(ValidationState.Error(Res.string.empty_input_password))

        } else if (passwordText.length < 3) {
            block(ValidationState.Error(Res.string.error_input_password))

        } else {
            block(ValidationState.Validate(mapToDomainModel()))
        }

    }


    override fun mapToDomainModel(): RegisterInputEmail {
        return RegisterInputEmail(
            passwordText, traits = TraitsEmail(email = loginIdentity)
        )
    }

}