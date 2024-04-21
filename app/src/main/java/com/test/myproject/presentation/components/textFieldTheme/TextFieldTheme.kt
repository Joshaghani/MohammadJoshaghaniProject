package com.test.myproject.presentation.components.textFieldTheme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.test.myproject.presentation.utilities.commaNumber.NumberCommaTransformation


@Composable
fun TextFieldTheme(
    label: String? = null,
    placeholder: String? = null,
    modifier: Modifier = Modifier,
    text: MutableState<String>,
    inputType: TypeInputTextField = TypeInputTextField.TEXT,
    singleLine: Boolean = true,
    keyboardActions: KeyboardActions = KeyboardActions(),
    enabled: Boolean = true,
    readOnly: Boolean = false,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    maxLength: Int = 500,
    colorPlaceHolderText: Color = MaterialTheme.colorScheme.onSecondary,
    imeAction: ImeAction = ImeAction.Default,
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = MaterialTheme.colorScheme.primary,
        unfocusedBorderColor = MaterialTheme.colorScheme.onTertiary,
        unfocusedContainerColor = MaterialTheme.colorScheme.background,
    )
) {


    val passwordVisibility = remember { mutableStateOf(false) }

    if (singleLine) {
        modifier.height(60.dp)
    }

    OutlinedTextField(
        value = text.value,
        modifier = modifier
            .fillMaxWidth(),
        visualTransformation = if (inputType == TypeInputTextField.NUMBER) NumberCommaTransformation()
        else if (inputType == TypeInputTextField.CARD_BACK) VisualTransformation { number ->
            formatOtherCardNumbers(number)
        }
        else if (inputType != TypeInputTextField.PASSWORD || passwordVisibility.value) VisualTransformation.None
        else PasswordVisualTransformation(),
        singleLine = singleLine,
        onValueChange = {
            if (it.length <= maxLength) {
                if (inputType == TypeInputTextField.NUMBER) {
                    if (it.isDigitsOnly()) text.value = it
                } else text.value = it
            }
        },
        textStyle = LocalTextStyle.current.copy(
            color = if (enabled) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSecondary,
            fontWeight = FontWeight.Medium,
            fontSize = MaterialTheme.typography.headlineSmall.fontSize
        ),
        placeholder = {
            placeholder?.let {
                Text(
                    text = placeholder,
                    color = colorPlaceHolderText,
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        },
        label = {
            label?.let {
                Text(
                    text = label,
                    color = colorPlaceHolderText,
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        },

        colors = colors,
        shape = MaterialTheme.shapes.medium,
        keyboardOptions = getKeyboardOption(inputType, imeAction),
        keyboardActions = keyboardActions,
        enabled = enabled,
        readOnly = readOnly,
        isError = isError,
        leadingIcon = leadingIcon,
        trailingIcon = if (inputType != TypeInputTextField.PASSWORD) {
            trailingIcon
        } else {
            passwordVisibilityBox(passwordVisibility)
        },
    )

}


