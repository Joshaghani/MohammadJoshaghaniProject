package com.test.myproject.presentation.screens.splash

import android.graphics.drawable.Icon
import android.widget.ProgressBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.test.myproject.R
import com.test.myproject.presentation.base.BaseHandler
import com.test.myproject.presentation.base.baseScreen.BaseScreenUnScrollable

class SplashScreen(
    override var handler: BaseHandler<SplashScreenViewModel, SplashScreenContract.Effect> = SplashScreenHandler()
) :
    BaseScreenUnScrollable<SplashScreenContract.State,
            SplashScreenContract.Event,
            SplashScreenContract.Effect,
            SplashScreenViewModel>(
        SplashScreenViewModel::class.java
    ) {


    @Composable
    override fun ComposeView(
        state: SplashScreenContract.State
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 120.dp),
            )


            Spacer(modifier = Modifier.weight(1f))

            CircularProgressIndicator()

            Spacer(modifier = Modifier.height(16.dp))


        }


    }


}

