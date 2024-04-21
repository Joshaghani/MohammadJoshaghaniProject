package com.test.myproject.data.network


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.InetAddress


class InternetAvailable {
    suspend fun isInternetAvailable(): Boolean {

        return try {
            withContext(Dispatchers.IO) {
                val address = InetAddress.getByName("www.google.com")
                address.hostName != ""
            }
        } catch (e: Exception) {
            false
        }

    }
}