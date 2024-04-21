package com.test.myproject.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ITextButton(
    title: String,
    modifier: Modifier = Modifier,
    paddingHorizontal: Int = 16,
    textColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    clickable: () -> Unit
) {

    Text(
        text = title,
        modifier = modifier
            .clipToBounds()
            .clip(MaterialTheme.shapes.medium)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(
                    color = MaterialTheme.colorScheme.primary,
                    radius = 0.dp
                )
            ) {
                clickable()
            }.padding(horizontal = paddingHorizontal.dp),
        style = MaterialTheme.typography.bodyLarge,
        color = textColor
    )

}