package com.test.myproject.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun RowSpaceBetween(
    title: String,
    content: String,
    fontSizeContext: TextUnit = MaterialTheme.typography.bodyLarge.fontSize,
    titleColor: Color = MaterialTheme.colorScheme.onSecondary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    clickable: () -> Unit = {}
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(text = title, color = titleColor)

        DashDivider(modifier = Modifier.weight(1f))

        Text(content,
            fontSize = fontSizeContext,
            color = contentColor,
            modifier = Modifier.clickable(
                interactionSource = remember { MutableInteractionSource() }, indication = null
            ) {
                clickable()
            })

    }
}

@Composable
fun RowSpaceBetweenMultipleLine(
    title: String,
    content: String,
    fontSizeContext: TextUnit = MaterialTheme.typography.bodyLarge.fontSize,
    titleColor: Color = MaterialTheme.colorScheme.onSecondary,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(text = title, color = titleColor)
        ISpacer(8)
        DashDivider(
            modifier = Modifier.padding(top = 12.dp).weight(1f)
        )

        Text(
            content,
            fontSize = fontSizeContext,
            color = contentColor,
            modifier = Modifier,
            textAlign = TextAlign.Left
        )
    }
}