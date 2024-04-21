package com.test.myproject.presentation.root


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.test.myproject.presentation.base.Navigator
import com.test.myproject.presentation.components.BottomBar
import com.test.myproject.presentation.components.Fab
import com.test.myproject.presentation.components.ISampleDialog
import com.test.myproject.presentation.components.showSampleDialog
import com.test.myproject.presentation.components.topbar.TopBar
import com.test.myproject.presentation.screens.splash.SplashScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

private lateinit var mainScope: CoroutineScope
private lateinit var snackbarHostState: SnackbarHostState


lateinit var screenSize: MutableState<Pair<Int, Int>>

fun showSnackbar(message: String) {
    mainScope.launch {
        snackbarHostState.showSnackbar(message)
    }
}


@Composable
fun AppContent() {

    screenSize = remember { mutableStateOf(Pair(-1, -1)) }

    Layout(content = {
        Navigator.clear()
        App()
        SplashScreen().show()
    }, measurePolicy = { measurables, constraints ->
        // Use the max width and height from the constraints
        val width = constraints.maxWidth
        val height = constraints.maxHeight

        screenSize.value = Pair(width, height)

        // Measure and place children composables
        val placeables = measurables.map { measurable ->
            measurable.measure(constraints)
        }

        layout(width, height) {
            var yPosition = 0
            placeables.forEach { placeable ->
                placeable.placeRelative(x = 0, y = yPosition)
                yPosition += placeable.height
            }
        }
    })


}

@Composable
fun App() {

    mainScope = rememberCoroutineScope()
    snackbarHostState = remember { SnackbarHostState() }

    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            snackbarHost = {
                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                    SnackbarHost(hostState = snackbarHostState)
                }
            },

            floatingActionButton = { Fab() },

            topBar = {
                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                    TopBar().Show()
                }
            },

            bottomBar = {

                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                    BottomBar().Show()
                }
            },

            ) { contentPadding ->

            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                Column(
                    modifier = Modifier
                        .padding(contentPadding)
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                ) {
                    Navigator.currentScreen.value?.ShowCompose()
                }
            }


        }

        if (ISampleDialog.isShow()) {
            ISampleDialog.getDialog()?.ShowDialog(showSampleDialog.value?.SampleDialogContent)
        }

    }

}




