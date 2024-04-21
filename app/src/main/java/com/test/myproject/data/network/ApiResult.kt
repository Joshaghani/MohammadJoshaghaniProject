package com.test.myproject.data.network

sealed class ApiResult<out T : Any?> {
    data class Success<out T : Any?>(val result: T) : ApiResult<T>()
    data class Error(val callErrors: CallErrors) : ApiResult<Nothing>()
    data object Loading : ApiResult<Nothing>()

}

sealed class ApiResultDownloadFile {
    data class Progress(val percent: Int) : ApiResultDownloadFile()
    data class Error(val exception: CallErrors) : ApiResultDownloadFile()
}