package com.test.myproject.presentation.screens.login.dto

import com.test.myproject.domain.login.LoginInput
import com.test.myproject.presentation.base.GlobalProperties
import com.test.myproject.presentation.root.Res
import com.test.myproject.presentation.utilities.dataTrasnferObject.ValidationService
import com.test.myproject.presentation.utilities.dataTrasnferObject.ValidationState
import com.test.myproject.presentation.utilities.validation.isValidEmailAddress
import com.test.myproject.presentation.utilities.validation.isValidUserName

data class LoginInputDto(
    val loginIdentity: String = "",
    val passwordText: String = "",

    ) : ValidationService<LoginInputDto, LoginInput> {
    override fun validate(block: ValidationState<LoginInput>.() -> Unit) {

        if (loginIdentity.isEmpty()) {
            block(ValidationState.Error(Res.string.empty_input_email_username))

        } else if (passwordText.isEmpty()) {
            block(ValidationState.Error(Res.string.empty_input_password))

        } else if (passwordText.length < 3) {
            block(ValidationState.Error(Res.string.error_input_password))

        } else {
            block(ValidationState.Validate(mapToDomainModel()))
        }

    }


    override fun mapToDomainModel(): LoginInput {
        return LoginInput(
            password_identifier = loginIdentity, password = passwordText
        )
    }

}