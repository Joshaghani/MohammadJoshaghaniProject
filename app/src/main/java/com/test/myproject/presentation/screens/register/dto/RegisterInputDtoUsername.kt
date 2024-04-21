package com.test.myproject.presentation.screens.register.dto

import com.test.myproject.domain.register.RegisterInputUsername
import com.test.myproject.domain.register.TraitsUsername
import com.test.myproject.presentation.root.Res
import com.test.myproject.presentation.utilities.dataTrasnferObject.ValidationService
import com.test.myproject.presentation.utilities.dataTrasnferObject.ValidationState
import com.test.myproject.presentation.utilities.validation.isValidUserName

data class RegisterInputDtoUsername(
    val loginIdentity: String = "",
    val fullName: String = "",
    val passwordText: String = "",
    val repeatPasswordText: String = "",
) : ValidationService<RegisterInputDtoUsername, RegisterInputUsername> {

    override fun validate(block: ValidationState<RegisterInputUsername>.() -> Unit) {

        if (loginIdentity.isEmpty()) {
            block(ValidationState.Error(Res.string.empty_input_email))

        } else if (isValidUserName(loginIdentity)) {
            block(ValidationState.Error(Res.string.error_input_username))

        } else if (passwordText.isEmpty()) {
            block(ValidationState.Error(Res.string.empty_input_password))

        } else if (passwordText.length < 3) {
            block(ValidationState.Error(Res.string.error_input_password))

        } else {
            block(ValidationState.Validate(mapToDomainModel()))
        }

    }


    override fun mapToDomainModel(): RegisterInputUsername {
        return RegisterInputUsername(
            passwordText, traits = TraitsUsername(username = loginIdentity)
        )
    }

}