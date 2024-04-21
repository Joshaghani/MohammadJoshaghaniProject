package com.test.myproject.data.managers

import com.test.myproject.data.network.ApiResult
import com.test.myproject.domain.IApiResponse
import com.test.myproject.domain.IResponse
import com.test.myproject.domain.login.LoginInput
import kotlinx.coroutines.flow.Flow

interface LoginService {

    suspend fun loginApi(
    ): Flow<ApiResult<IApiResponse>>


    suspend fun login(
        input: LoginInput,
        flow: String
    ): Flow<ApiResult<IResponse>>


}