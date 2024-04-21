package com.test.myproject.presentation.utilities.dataTrasnferObject

sealed class ValidationState<out Model> {
    data class Validate<out Model>(val model: Model) : ValidationState<Model>()
    data class Error(val message: String) : ValidationState<Nothing>()
}
