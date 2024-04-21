package com.test.myproject.data.database.room

sealed class ResponseDb<out TYPE> {
    data class Message(val message: String) : ResponseDb<Nothing>()
    data class Success<TYPE>(val row: TYPE) : ResponseDb<TYPE>()
}
