package com.test.myproject.presentation.base.baseScreen

import androidx.compose.runtime.Composable
import com.test.myproject.presentation.base.ViewEvent
import com.test.myproject.presentation.base.ViewState

interface IScreen<STATE : ViewState<Event>, Event : ViewEvent> {

    @Composable
    fun SetScreen(state: STATE)

}