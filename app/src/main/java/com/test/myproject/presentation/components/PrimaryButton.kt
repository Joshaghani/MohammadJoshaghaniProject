package com.test.myproject.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryButton(
    title: String,
    modifier: Modifier = Modifier,
    leftIconPainter: Painter? = null,
    rightIconPainter: Painter? = null,
    color: Color = MaterialTheme.colorScheme.primaryContainer,
    enabled: Boolean = true,
    paddingTop: Dp = 24.dp,
    textColor: Color = White,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = color,
        ),
        modifier = modifier
            .padding(top = paddingTop)
            .fillMaxWidth(),
        shape = MaterialTheme.shapes.large
    ) {
        leftIconPainter?.let {
            Icon(
                painter = it,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .offset(x = (-10).dp)
                    .size(20.dp),
                contentDescription = null,
                tint = White

            )
        }
        Text(
            text = title, color = textColor,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .offset(x = if (leftIconPainter != null) (-10).dp else 0.dp)
        )

        rightIconPainter?.let {
            Icon(
                painter = it,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .offset(x = (-5).dp)
                    .size(20.dp),
                contentDescription = null,
                tint = White
            )
        }

    }


}