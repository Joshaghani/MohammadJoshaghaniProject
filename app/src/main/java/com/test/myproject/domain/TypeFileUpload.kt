package com.test.myproject.domain

import kotlinx.serialization.Serializable

@Serializable
data class TypeFileUpload(
    val mpFile: ByteArray,
    val name: String,
    val typeFile: String
)