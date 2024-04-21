package com.test.myproject.presentation.utilities.commaNumber


fun String.removePointInMoney(): String {
    val newValue = split(".")
    return newValue[0]
}

fun Long.removePointInMoney(): String {
    return this.toString().split(".")[0]
}

fun Double.removePointInMoney(): Long {
    return this.toString().split(".")[0].toLong()
}

fun String.isDigitsOnly() = this.all { it in '0'..'9' }
