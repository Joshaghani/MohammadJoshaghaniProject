package com.test.myproject.presentation.screens.login.reduce

import com.test.myproject.data.network.ApiResult
import com.test.myproject.domain.IResponse
import com.test.myproject.presentation.screens.login.LoginScreenContract


fun ApiResult<IResponse>.reduceLogin(): LoginScreenContract.Effect {
    return when (this) {
        is ApiResult.Error -> LoginScreenContract.Effect.ShowToast(callErrors.warningMessage)
        ApiResult.Loading -> LoginScreenContract.Effect.Loading
        is ApiResult.Success -> LoginScreenContract.Effect.SuccessLogin(this.result)
    }
}