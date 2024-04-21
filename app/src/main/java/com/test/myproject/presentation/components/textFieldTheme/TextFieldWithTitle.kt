package com.test.myproject.presentation.components.textFieldTheme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.test.myproject.presentation.components.ISpacer

@Composable
fun TextFieldWithTitle(
    title: String,
    warningTitle: String? = null,
    modifier: Modifier = Modifier,
    placeholder: String? = null,
    label: String? = null,
    topPadding: Boolean = true,
    text: MutableState<String>,
    inputType: TypeInputTextField = TypeInputTextField.TEXT,
    singleLine: Boolean = true,
    keyboardActions: KeyboardActions = KeyboardActions(),
    enabled: Boolean = true,
    readOnly: Boolean = false,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    showErrorText: Boolean = false,
    textErrorText: String = "",
    icon: Int? = null,
    textErrorColor: Color = MaterialTheme.colorScheme.error,
    maxLength: Int = 500,
    colorPlaceHolderText: Color = MaterialTheme.colorScheme.onSecondary,
    imeAction: ImeAction = ImeAction.Default,
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = MaterialTheme.colorScheme.primary,
        unfocusedBorderColor = MaterialTheme.colorScheme.onBackground,
        unfocusedContainerColor = MaterialTheme.colorScheme.background,
    )
) {

    if (topPadding) {
        Spacer(modifier = Modifier.height(24.dp))
    }

    Row(
        modifier = Modifier.padding(horizontal = 8.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        icon?.let {
            Icon(
                painter = painterResource(it),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimary
            )
            ISpacer(8)
        }
        Text(
            text = title, color = MaterialTheme.colorScheme.onPrimary
        )
        warningTitle?.let {
            Text(
                modifier = Modifier.padding(horizontal = 6.dp),
                text = warningTitle,
                color = MaterialTheme.colorScheme.error
            )
        }
    }

    TextFieldTheme(
        label = label,
        placeholder,
        colorPlaceHolderText = colorPlaceHolderText,
        text = text,
        modifier = modifier,
        inputType = inputType,
        singleLine = singleLine,
        keyboardActions = keyboardActions,
        enabled = enabled,
        readOnly = readOnly,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        isError = isError,
        maxLength = maxLength,
        imeAction = imeAction,
        colors = colors
    )

    if (showErrorText) {
        ISpacer(8)
        Row(
            modifier = Modifier.fillMaxWidth(0.95f), horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = textErrorText,
                color = textErrorColor,
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }

}