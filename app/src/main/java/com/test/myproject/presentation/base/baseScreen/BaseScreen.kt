package com.test.myproject.presentation.base.baseScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.test.myproject.presentation.base.BaseViewModel
import com.test.myproject.presentation.base.ViewEvent
import com.test.myproject.presentation.base.ViewSideEffect
import com.test.myproject.presentation.base.ViewState

abstract class BaseScreen<State : ViewState<Event>, Event : ViewEvent, Effect : ViewSideEffect, VM : BaseViewModel<Event, State, Effect>>(
    modelClass: Class<VM>
) :
    RootScreen<State, Event, Effect, VM>(modelClass), IScreen<State, Event> {


    var maxHeightScreen: Dp = 0.dp

    @Composable
    override fun ShowCompose() {
        super.ShowCompose(this)
    }

    @Composable
    override fun SetScreen(state: State) {

        val mainScrollState = rememberScrollState()
        val enabledScrollMain = mutableStateOf(true)
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
            maxHeightScreen = maxHeight
            Column(
                modifier = Modifier
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) {
//                        focusManager.clearFocus()
                    }
                    .nestedScroll(nestedScrollConnection)
                    .verticalScroll(
                        mainScrollState, enabled = enabledScrollMain.value
                    )
                    .fillMaxSize()
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(maxHeightScreen)
                ) {
                    ComposeUI(state)
                }
            }
        }

    }
}