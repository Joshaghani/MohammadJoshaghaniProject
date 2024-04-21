package com.test.myproject.presentation.utilities.validation

import android.text.TextUtils

fun isValidEmailAddress(email: String, isEmpty: Boolean = false): Boolean {
    return if (isEmpty && TextUtils.isEmpty(email)) {
        true
    } else {
        !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}