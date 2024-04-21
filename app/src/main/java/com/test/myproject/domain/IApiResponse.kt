package com.test.myproject.domain

import kotlinx.serialization.Serializable


@Serializable
data class IApiResponse(
    val id: String,
    val ui: UI,
) : java.io.Serializable


