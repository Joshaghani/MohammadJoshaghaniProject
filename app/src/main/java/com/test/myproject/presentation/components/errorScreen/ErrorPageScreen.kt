package com.test.myproject.presentation.components.errorScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.test.myproject.R
import com.test.myproject.presentation.base.ViewEvent
import com.test.myproject.presentation.components.BorderButton
import com.test.myproject.presentation.components.ISpacer


@Composable
fun <Event : ViewEvent> ErrorPageScreen(
    message: String,
    event: Event,
    retryClick: (Event) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = message,
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold
        )

        ISpacer(16)

        BorderButton(
            title = "تلاش مجدد",
            iconPainter = painterResource(R.drawable.ic_refresh_circle),
            modifier = Modifier.width(200.dp)
        ) {
            retryClick(event)
        }

        ISpacer(56)

    }


}