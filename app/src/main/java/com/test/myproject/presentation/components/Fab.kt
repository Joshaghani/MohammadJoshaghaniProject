package com.test.myproject.presentation.components

import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import com.test.myproject.presentation.base.Navigator
import com.test.myproject.presentation.base.ShowFab

@Composable
fun Fab() {

    when (val currentScreen = Navigator.currentScreen.value) {
        is ShowFab -> {

            if (currentScreen.viewModel.viewState.value.errorScreen == null &&
                !currentScreen.viewModel.viewState.value.isLoading
            ) {

                currentScreen.IconFab()?.let { icon ->

                    if (icon.title.isNullOrEmpty()) {

                        FloatingActionButton(onClick = {
                            currentScreen.onFabButtonPressed()
                        }) {
                            Icon(
                                icon.painter,
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.background
                            )
                        }

                    } else {

                        ExtendedFloatingActionButton(
                            onClick = { currentScreen.onFabButtonPressed() },
                            icon = {
                                Icon(
                                    icon.painter,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.background
                                )
                            },
                            text = {
                                Text(
                                    text = icon.title,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = MaterialTheme.colorScheme.background
                                )
                            },
                        )
                    }
                }
            }
        }
    }

}
