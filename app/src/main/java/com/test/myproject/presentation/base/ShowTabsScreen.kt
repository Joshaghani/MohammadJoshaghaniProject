package com.test.myproject.presentation.base

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter


data class FabModel(
    val painter: Painter,
    val title: String? = null
)

interface ShowFab {
    fun onFabButtonPressed()

    @Composable
    fun IconFab(): FabModel?
}

interface ShowTopbar {

    fun titleTopBar(): String
}

interface ShowBottombar

interface LazyListScreen<State : ViewState<Event>, Event : ViewEvent> {
    fun getItemsList(state: State): MutableList<Any>

    @Composable
    fun ItemUI(state: State, index: Int, item: Any)

    @Composable
    fun FooterUI(state: State) {
    }


}
