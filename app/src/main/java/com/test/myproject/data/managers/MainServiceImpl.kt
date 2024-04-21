package com.test.myproject.data.managers

import io.ktor.client.HttpClient

class MainServiceImpl(
    private val client: HttpClient
) : MainService {
}