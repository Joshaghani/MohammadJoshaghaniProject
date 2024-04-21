package com.test.myproject.presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun BorderCard(
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    borderColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    elevation: Dp = 0.dp,
    clickable: (() -> Unit)? = null,
    paddingValue: Dp = 16.dp,
    borderWidth: Dp = 1.dp,
    content: @Composable ColumnScope.() -> Unit,
) {


    Column(
        modifier = Modifier.padding(top = 16.dp)
    ) {

        Card(
            modifier = modifier.border(
                width = borderWidth, color = borderColor, shape = MaterialTheme.shapes.extraLarge
            ).clip(MaterialTheme.shapes.extraLarge),
            colors = CardDefaults.cardColors(containerColor = backgroundColor),
            elevation = CardDefaults.cardElevation(elevation)

        ) {

            if (clickable != null) {
                Column(modifier = Modifier.clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = rememberRipple(color = MaterialTheme.colorScheme.primary)
                    ) {
                        clickable()
                    }.padding(paddingValue), content = content)

            } else {
                Column(
                    modifier = Modifier.padding(paddingValue), content = content
                )
            }


        }

    }
}