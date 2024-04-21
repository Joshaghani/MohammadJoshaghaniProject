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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun OnBackgroundButton(
    title: String,
    modifier: Modifier = Modifier,
    iconPainter: Painter? = null,
    enabled: Boolean = true,
    paddingTop: Dp = 24.dp,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            MaterialTheme.colorScheme.onSurfaceVariant,
            contentColor = MaterialTheme.colorScheme.primary,
        ),
        modifier = modifier
            .padding(top = paddingTop)
            .fillMaxWidth(),
        shape = MaterialTheme.shapes.large
    ) {
        iconPainter?.let {
            Icon(
                painter = it,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .offset(x = (-10).dp)
                    .size(20.dp),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primaryContainer
            )
        }
        Text(
            text = title, color = MaterialTheme.colorScheme.background,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .offset(x = if (iconPainter != null) (-10).dp else 0.dp)
        )
    }


}