package com.test.myproject.presentation.components.topbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.myproject.R
import com.test.myproject.presentation.base.ShowTopbar

@Composable
fun TopBar.ShowBodyMainScreen(heightTopBar: Int) {

    var titleTopBar by remember { mutableStateOf(heightTopBar) }

    val iconSize = 40

    val speed = 2.7
    val height = 105

    titleTopBar = if ((heightTopBar / speed) > iconSize) {
        (heightTopBar / speed).toInt()
    } else {
        iconSize
    }

    Box(Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .padding(vertical = 22.dp)
                    .width(56.dp),
            )
        }

        Column(Modifier.padding(32.dp)) {
            Text(
                (screen as ShowTopbar).titleTopBar(), fontSize = 16.sp //titleTopBar.sp
            )
        }

    }


}
