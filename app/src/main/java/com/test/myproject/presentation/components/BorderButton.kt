package com.test.myproject.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BorderButton(
    title: String,
    modifier: Modifier = Modifier,
    iconPainter: Painter? = null,
    rightIconPainter: Painter? = null,
    enabled: Boolean = true,
    tint: Color = MaterialTheme.colorScheme.onPrimary,
    borderColor: Color = MaterialTheme.colorScheme.onPrimary,
    onClick: () -> Unit
) {
    Button(
        enabled = enabled,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = MaterialTheme.colorScheme.primary,
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
            disabledContainerColor = MaterialTheme.colorScheme.surfaceVariant
        ), border = BorderStroke(1.dp, borderColor), modifier = modifier
//            .padding(top = 24.dp)
            .fillMaxWidth(), shape = RoundedCornerShape(10.dp)
    ) {
        iconPainter?.let {
            Icon(
                painter = it,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .offset(x = (-10).dp, y = 0.dp)
                    .size(20.dp),
                contentDescription = null,
                tint = tint
            )
        }
        Text(
            text = title,
            color = if (enabled) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onTertiary,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.offset(x = if (iconPainter != null) (-10).dp else 0.dp)
        )

        rightIconPainter?.let {
            Icon(
                painter = it,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .offset(x = (-5).dp)
                    .size(20.dp),
                contentDescription = null,
                tint = tint
            )
        }
    }


}