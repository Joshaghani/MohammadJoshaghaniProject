package com.test.myproject.presentation.utilities.validation

import com.test.myproject.presentation.root.Res


fun isValidPassword(password: String, isEmpty: Boolean = false): Boolean {
    if (isEmpty && password.isEmpty()) return true
    return password.length >= 6
}

fun isValidRepeatPassword(
    password: String,
    repeatPassword: String,
    isEmpty: Boolean = false
): Boolean {
    if (isEmpty && repeatPassword.isEmpty()) return true
    if (repeatPassword.length < 6) return false
    return repeatPassword == password
}

fun getMessageErrorPassword(
    password: String,
    repeatPassword: String,
    isEmpty: Boolean = false
): String {
    if (isEmpty && repeatPassword.isEmpty()) return ""
    if (repeatPassword.length < 6) return Res.string.error_input_password
    if (repeatPassword != password) return Res.string.error_input_password_not_equal
    return ""
}