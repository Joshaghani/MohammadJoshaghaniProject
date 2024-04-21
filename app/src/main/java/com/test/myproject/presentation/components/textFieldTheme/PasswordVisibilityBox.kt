package com.test.myproject.presentation.components.textFieldTheme

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.test.myproject.R


@Composable
fun passwordVisibilityBox(
    passwordVisibility: MutableState<Boolean>
): @Composable (() -> Unit) {
    return {
        TextButton(
            onClick = { passwordVisibility.value = !passwordVisibility.value },
            Modifier.size(56.dp, 56.dp)
        ) {
            Icon(
                painter = if (passwordVisibility.value) {
                    painterResource(R.drawable.ic_visibility_on)
                } else {
                    painterResource(R.drawable.ic_visibility_off)
                }, tint = MaterialTheme.colorScheme.onPrimary, contentDescription = null
            )
        }
    }
}
