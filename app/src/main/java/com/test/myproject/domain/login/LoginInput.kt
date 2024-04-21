package com.test.myproject.domain.login

import kotlinx.serialization.Serializable


@Serializable
data class LoginInput(
    val password_identifier: String,
    val password: String,
    val csrf_token: String = "",
    val method: String = "password",
) : java.io.Serializable