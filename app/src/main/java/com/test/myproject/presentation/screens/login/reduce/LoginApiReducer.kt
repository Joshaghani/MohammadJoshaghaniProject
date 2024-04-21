package com.test.myproject.presentation.screens.login.reduce

import com.test.myproject.data.network.ApiResult
import com.test.myproject.domain.IApiResponse
import com.test.myproject.presentation.screens.login.LoginScreenContract
import com.test.myproject.presentation.screens.login.LoginScreenViewModel


fun ApiResult<IApiResponse>.reduceLogin(): LoginScreenContract.Effect {
    return when (this) {
        is ApiResult.Error -> LoginScreenContract.Effect.ErrorPage(
            callErrors.warningMessage,
            LoginScreenViewModel.TypeRequests.LOGIN_API.type
        )

        ApiResult.Loading -> LoginScreenContract.Effect.Loading
        is ApiResult.Success -> LoginScreenContract.Effect.SuccessGetLoginApi(result)
    }
}