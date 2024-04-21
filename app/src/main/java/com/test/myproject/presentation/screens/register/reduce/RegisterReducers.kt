package com.test.myproject.presentation.screens.register.reduce

import com.test.myproject.data.network.ApiResult
import com.test.myproject.domain.IResponse
import com.test.myproject.presentation.screens.register.RegisterScreenContract


fun ApiResult<IResponse>.reduceRegister(): RegisterScreenContract.Effect {
    return when (this) {
        is ApiResult.Error -> RegisterScreenContract.Effect.ShowToast(callErrors.warningMessage)
        ApiResult.Loading -> RegisterScreenContract.Effect.Loading
        is ApiResult.Success -> RegisterScreenContract.Effect.SuccessGetRegister(result)
    }
}