package com.test.myproject.presentation.base.baseScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.platform.LocalFocusManager
import com.test.myproject.presentation.base.BaseViewModel
import com.test.myproject.presentation.base.ViewEvent
import com.test.myproject.presentation.base.ViewSideEffect
import com.test.myproject.presentation.base.ViewState


abstract class BaseScreenUnScrollable<
        State : ViewState<Event>,
        Event : ViewEvent,
        Effect : ViewSideEffect,
        VM : BaseViewModel<Event, State, Effect>>(
    modelClass: Class<VM>
) :
    RootScreen<State, Event, Effect, VM>(modelClass), IScreen<State, Event> {


    @Composable
    override fun ShowCompose() {
        super.ShowCompose(this)
    }

    @Composable
    override fun SetScreen(
        state: State,
    ) {

        val mainScrollState = rememberScrollState()
        val focusManager = LocalFocusManager.current

        scrollPosition.value = mainScrollState.value

        val nestedScrollConnection = remember {
            object : NestedScrollConnection {
                override fun onPreScroll(
                    available: Offset, source: NestedScrollSource
                ): Offset {
//                    focusManager.clearFocus()
                    return Offset.Zero
                }
            }

        }


        BoxWithConstraints {
            Column(
                modifier = Modifier
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) {
                        focusManager.clearFocus()
                    }
                    .fillMaxSize()
                    .height(this@BoxWithConstraints.maxHeight)
            ) {
                ComposeUI(state)
            }
        }

    }
}