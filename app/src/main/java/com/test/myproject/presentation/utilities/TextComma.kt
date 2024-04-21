package com.test.myproject.presentation.utilities

 fun String.formatWithComma(value: Long): String {
    return "%,d".format(value)
}

 fun Long?.formatWithComma(): String {
    return "%,d".format(this ?: 0)
}
