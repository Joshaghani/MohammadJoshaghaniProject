package com.test.myproject.presentation.components.errorScreen

data class ErrorScreenMessage<Event>(
    val message: String,
    val event: Event,
)