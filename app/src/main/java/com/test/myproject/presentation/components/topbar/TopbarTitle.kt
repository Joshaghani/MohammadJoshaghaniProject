package com.test.myproject.presentation.components.topbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.myproject.presentation.base.ShowTopbar

@Composable
fun TopBar.ShowTitle(heightTopBar: Int) {
    var titleTopBar by remember { mutableStateOf(0) }

    val fontSize = 16

    val height = 30

    val speed = 0.3

    titleTopBar =
        if (height - (screen!!.scrollPosition.value * speed) > fontSize) {
            (height - (screen.scrollPosition.value * speed)).toInt()
        } else fontSize


    Row(
        modifier = Modifier
            .padding(vertical = 16.dp)
            .height(height.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        Text(
            (screen as ShowTopbar).titleTopBar(), fontSize = 16.sp //titleTopBar.sp
        )
    }
}