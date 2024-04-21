package com.test.myproject.presentation.components.textFieldTheme

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType

fun getKeyboardOption(
    intputType: TypeInputTextField,
    imeAction: ImeAction
): KeyboardOptions {
    return when (intputType) {
        TypeInputTextField.TEXT -> KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Text,
            imeAction = imeAction
        )

        TypeInputTextField.PASSWORD -> KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Password,
            imeAction = imeAction
        )

        TypeInputTextField.PHONE_NUMBER -> KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Number,
            imeAction = imeAction
        )

        TypeInputTextField.NUMBER -> KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Number,
            imeAction = imeAction
        )

        TypeInputTextField.CARD_BACK -> KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Number,
            imeAction = imeAction
        )

        TypeInputTextField.EMAIL -> KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Email,
            imeAction = imeAction
        )
    }
}