package com.test.myproject.presentation.utilities.validation



fun isValidUserName(username: String, isEmpty: Boolean = false): Boolean {
    if (isEmpty && username.isEmpty()) return true
    return username.length < 5
}