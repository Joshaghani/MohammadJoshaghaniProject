package com.test.myproject.data.managers

import com.test.myproject.data.network.ApiConnection
import com.test.myproject.data.network.ApiResult
import com.test.myproject.data.network.ApiRoute
import com.test.myproject.domain.IApiResponse
import com.test.myproject.domain.IResponse
import com.test.myproject.domain.login.LoginInput
import io.ktor.client.HttpClient
import kotlinx.coroutines.flow.Flow

class LoginServiceImpl(
    private val client: HttpClient
) : LoginService {

    override suspend fun loginApi(): Flow<ApiResult<IApiResponse>> =
        ApiConnection(
            url = ApiRoute.LOGIN_API,
            client = client,
            type = ApiConnection.TypeMethod.GET
        ).callApi()

    override suspend fun login(input: LoginInput, flow: String): Flow<ApiResult<IResponse>> =
        ApiConnection(
            url = ApiRoute.LOGIN,
            client = client,
            parameters = listOf(Pair("flow", flow)),
            input = input
        ).callApi()


}