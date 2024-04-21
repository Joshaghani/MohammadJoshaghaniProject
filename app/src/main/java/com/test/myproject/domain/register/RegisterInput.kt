package com.test.myproject.domain.register

import kotlinx.serialization.Serializable



@Serializable
data class RegisterInputEmail(
    val password: String,
    val traits: TraitsEmail,
    val csrf_token: String = "",
    val method: String = "password",
) : java.io.Serializable


@Serializable
data class TraitsEmail(
    val email: String = "",
) : java.io.Serializable

@Serializable
data class RegisterInputUsername(
    val password: String,
    val traits: TraitsUsername,
    val csrf_token: String = "",
    val method: String = "password",
) : java.io.Serializable


@Serializable
data class TraitsUsername(
    val username: String = "",
) : java.io.Serializable