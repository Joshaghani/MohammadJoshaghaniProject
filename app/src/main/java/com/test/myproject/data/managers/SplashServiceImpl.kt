package com.test.myproject.data.managers

import io.ktor.client.HttpClient

class SplashServiceImpl(
    private val client: HttpClient
) : SplashService {
}