package com.test.myproject.presentation.base.baseScreen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import com.test.myproject.presentation.components.ISpacer
import com.test.myproject.presentation.base.BaseViewModel
import com.test.myproject.presentation.base.LazyListScreen
import com.test.myproject.presentation.base.ViewEvent
import com.test.myproject.presentation.base.ViewSideEffect
import com.test.myproject.presentation.base.ViewState

abstract class BaseScreenLazyList
<State : ViewState<Event>, Event : ViewEvent, Effect : ViewSideEffect, VM : BaseViewModel<Event, State, Effect>>(
    modelClass: Class<VM>,
) :
    RootScreen<State, Event, Effect, VM>(modelClass), IScreen<State, Event>,
    LazyListScreen<State, Event> {

    @Composable
    override fun ShowCompose() {
        super.ShowCompose(this)
    }

    open val isStickyHeader = false
    lateinit var listLazyState: LazyListState

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    override fun SetScreen(state: State) {

        listLazyState = rememberLazyListState()

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

//        scrollPosition.value = remember {
//            derivedStateOf {
//                (listLazyState.firstVisibleItemIndex * 700) //+ listLazyState.firstVisibleItemScrollOffset
//            }
//        }.value


        BoxWithConstraints {
            LazyColumn(
                state = listLazyState,
                modifier = Modifier
                    .nestedScroll(nestedScrollConnection)
                    .fillMaxWidth()
                    .height(this@BoxWithConstraints.maxHeight),

                ) {

                if (isStickyHeader) {
                    stickyHeader {
                        Column {
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
                                shape = RoundedCornerShape(0),
                                elevation = CardDefaults.cardElevation(5.dp)
                            ) {
                                ComposeUI(state)
                            }

                        }
                    }
                } else {
                    item {
                        ComposeUI(state)
                    }
                }

                itemsIndexed(getItemsList(state)) { index: Int, item: Any ->
                    ItemUI(state, index, item)
                }

                item {
                    LaunchedEffect(true) {
                        //Do something when List end has been reached
                        lazyColumnScrolledEnd()
                    }
                }

                if (getItemsList(state).isEmpty()) {
                    item {

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(86.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                "لیست خالی می باشد!",
                                style = MaterialTheme.typography.headlineMedium
                            )
                        }

                    }
                }


                item { FooterUI(state) }

                item { ISpacer(150) }
            }
        }

    }


    @Composable
    fun LoadMoreProgressbar() {
        Row(
            Modifier
                .padding(32.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircularProgressIndicator()
        }
    }


    open fun lazyColumnScrolledEnd() {}

}