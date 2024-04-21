package com.test.myproject.presentation.base

import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage


interface ViewState<Event : ViewEvent> {
    var errorScreen: ErrorScreenMessage<Event>?
    var isLoading: Boolean
    var toastMessage: String?
}