package com.test.myproject.presentation.activity

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.test.myproject.presentation.base.GlobalProperties
import com.test.myproject.presentation.base.Navigator
import com.test.myproject.presentation.root.AppContent
import com.test.myproject.presentation.root.showSnackbar
import com.test.myproject.presentation.ui.theme.MyProjectTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlin.system.exitProcess

private var doubleBackToExitPressedOnce = false

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GlobalProperties.currentActivity = this

        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)

        setContent {

//            BackHandler {
//                if (Navigator.currentScreen.value?.onBackPressed() == false) {
//
//                    if (doubleBackToExitPressedOnce) {
//                        exitProcess(0)
//                    }
//
//                    doubleBackToExitPressedOnce = true
//
//                    showSnackbar("برای خروج دوباره کلید بازگشت را بزنید")
//
//                    Handler(Looper.getMainLooper()).postDelayed({
//                        doubleBackToExitPressedOnce = false
//                    }, 2000)
//
//                }
//            }


            MyProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppContent()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
//    MyProjectTheme {
//        Greeting("Android")
//    }
}