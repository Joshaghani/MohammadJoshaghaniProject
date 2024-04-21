package com.test.myproject.presentation.utilities.validation


fun isValidFullName(fullName: String, isEmpty: Boolean = false): Boolean {
    if (isEmpty && fullName.isEmpty()) return true
    return fullName.length >= 6
}
