package com.test.myproject.data.network

sealed class CallErrors(val warningMessage: String) {
    //    data class ErrorServer(val throwable: String) : CallErrors()
//    data class Message(val message: String) : CallErrors()
    data object IsVPNActive : CallErrors("لطفا فیلتر شکن خود را غیر فعال کنید")
    data object NetworkNotAvailable : CallErrors("عدم دسترسی به اینترنت")
    data object ErrorException : CallErrors("خطا در برقراری ارتباط")
    data object Unauthorized : CallErrors("شما اجازه دسترسی ندارید")
    data object ClientError : CallErrors("ورودی نامعتبر")
    data object Redirection : CallErrors("آدرس نامعتبر")
    data object ServerError : CallErrors("مدتی مشغول بروزرسانی هستیم. لطفا صبر کنید")

}