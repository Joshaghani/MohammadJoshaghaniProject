package com.test.myproject.domain

import kotlinx.serialization.Serializable


@Serializable
data class ApiModelResponse<T>(
    val isSuccess: Boolean,

    val message: String,

    val data: T? = null
) : java.io.Serializable

