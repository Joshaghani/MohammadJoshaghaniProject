package com.test.myproject.presentation.screens.register.reduce

import com.test.myproject.data.network.ApiResult
import com.test.myproject.domain.IApiResponse
import com.test.myproject.presentation.screens.register.RegisterScreenContract
import com.test.myproject.presentation.screens.register.RegisterScreenViewModel


fun ApiResult<IApiResponse>.reduceRegister(): RegisterScreenContract.Effect {
    return when (this) {
        is ApiResult.Error -> RegisterScreenContract.Effect.ErrorPage(
            callErrors.warningMessage,
            RegisterScreenViewModel.TypeRequests.REGISTER_API.type
        )

        ApiResult.Loading -> RegisterScreenContract.Effect.Loading
        is ApiResult.Success -> RegisterScreenContract.Effect.SuccessGetResgisterApi(result)
    }
}