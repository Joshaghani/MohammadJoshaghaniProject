package com.test.myproject.data.managers

import com.test.myproject.data.network.ApiResult
import com.test.myproject.domain.IApiResponse
import com.test.myproject.domain.IResponse
import com.test.myproject.domain.register.RegisterInputEmail
import com.test.myproject.domain.register.RegisterInputUsername
import kotlinx.coroutines.flow.Flow

interface RegisterService {

    suspend fun registerApi(
    ): Flow<ApiResult<IApiResponse>>


    suspend fun registerWithEmail(
        input: RegisterInputEmail,
        flow: String
    ): Flow<ApiResult<IResponse>>

    suspend fun registerWithUsername(
        input: RegisterInputUsername,
        flow: String
    ): Flow<ApiResult<IResponse>>


}