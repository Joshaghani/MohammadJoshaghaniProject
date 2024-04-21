package com.test.myproject.presentation.components.topbar

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.test.myproject.presentation.base.Navigator
import com.test.myproject.presentation.base.ShowTopbar
import com.test.myproject.presentation.base.baseScreen.BaseScreenLazyList
import com.test.myproject.presentation.root.screenSize
import com.test.myproject.presentation.screens.main.MainScreen


class TopBar {

    val screen = Navigator.currentScreen.value

    val speed = 0.8

    private val height =
        if (Navigator.currentScreen.value is MainScreen) screenSize.value.second / 10 else 56


    @Composable
    fun Show() {
        if (screen is ShowTopbar) {
            TopBar()
        }
    }


    @SuppressLint("NotConstructor")
    @Composable
    private fun TopBar() {

        var heightTopBar by remember {
            mutableStateOf(0)
        }

        heightTopBar = if (height - (screen!!.scrollPosition.value * speed) > 56) {
            height - (screen.scrollPosition.value * speed).toInt()
        } else 56


        if (Navigator.currentScreen.value is MainScreen) {
            Card(
                modifier = Modifier
                    .height(heightTopBar.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
                shape = RoundedCornerShape(0),
            ) {
                Row {
                    ShowNavigationIcon().Show()
                    ShowBodyTopbar(heightTopBar).Show()
                }
            }

        } else {

            Column {
                if ((Navigator.currentScreen.value is BaseScreenLazyList)) {
                    if ((Navigator.currentScreen.value as BaseScreenLazyList).isStickyHeader) {
                        Card(
                            modifier = Modifier
                                .height(heightTopBar.dp)
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
                            shape = RoundedCornerShape(0),
                            elevation = CardDefaults.cardElevation(0.dp)
                        ) {
                            Row {
                                ShowNavigationIcon().Show()
                                ShowBodyTopbar(heightTopBar).Show()
                            }
                        }
                    } else {
                        Card(
                            modifier = Modifier
                                .height(heightTopBar.dp)
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
                            shape = RoundedCornerShape(0),
                            elevation = CardDefaults.cardElevation(5.dp)
                        ) {
                            Row {
                                ShowNavigationIcon().Show()
                                ShowBodyTopbar(heightTopBar).Show()
                            }
                        }

                    }
                } else {
                    Card(
                        modifier = Modifier
                            .height(heightTopBar.dp)
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
                        shape = RoundedCornerShape(0),
                        elevation = CardDefaults.cardElevation(5.dp)
                    ) {
                        Row {
                            ShowNavigationIcon().Show()
                            ShowBodyTopbar(heightTopBar).Show()
                        }
                    }

                }

            }

        }

    }

    private inner class ShowNavigationIcon {
        private var show = Navigator.isMainScreen()

        @Composable
        fun Show() {
            if (!show) {
                IconBack()
            }
        }

        @Composable
        private fun IconBack() {
            Row(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .clickable {
                        Navigator.currentScreen.value?.onBackPressed()
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    Icons.Rounded.ArrowForward, contentDescription = null
                )
            }
        }
    }

    private inner class ShowBodyTopbar(val heightTopBar: Int) {

        private var isMainScreen = Navigator.currentScreen.value is MainScreen

        @Composable
        fun Show() {
            if (isMainScreen) {
                ShowBodyMainScreen(heightTopBar)
            } else {
                ShowTitle(heightTopBar)
            }
        }


    }
}


