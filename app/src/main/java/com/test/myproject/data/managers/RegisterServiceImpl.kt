package com.test.myproject.data.managers

import com.test.myproject.data.network.ApiConnection
import com.test.myproject.data.network.ApiResult
import com.test.myproject.data.network.ApiRoute
import com.test.myproject.domain.IApiResponse
import com.test.myproject.domain.IResponse
import com.test.myproject.domain.register.RegisterInputEmail
import com.test.myproject.domain.register.RegisterInputUsername
import io.ktor.client.HttpClient
import kotlinx.coroutines.flow.Flow

class RegisterServiceImpl(
    private val client: HttpClient
) : RegisterService {

    override suspend fun registerApi(): Flow<ApiResult<IApiResponse>> =
        ApiConnection(
            url = ApiRoute.REGISTER_API,
            client = client,
            type = ApiConnection.TypeMethod.GET,
        ).callApi()

    override suspend fun registerWithEmail(
        input: RegisterInputEmail,
        flow: String
    ): Flow<ApiResult<IResponse>> =
        ApiConnection(
            url = ApiRoute.REGISTER,
            client = client,
            parameters = listOf(Pair("flow", flow)),
            input = input
        ).callApi()

    override suspend fun registerWithUsername(
        input: RegisterInputUsername,
        flow: String
    ): Flow<ApiResult<IResponse>> =
        ApiConnection(
            url = ApiRoute.REGISTER,
            client = client,
            parameters = listOf(Pair("flow", flow)),
            input = input
        ).callApi()


}