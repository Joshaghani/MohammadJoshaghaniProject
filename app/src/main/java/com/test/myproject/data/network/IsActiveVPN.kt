package com.test.myproject.data.network

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

fun isVpnActive(context: Context): Boolean {
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val networkInfos = connectivityManager.allNetworks
    for (networkInfo in networkInfos) {
        val networkCapabilities = connectivityManager.getNetworkCapabilities(networkInfo)
        if (networkCapabilities?.hasTransport(NetworkCapabilities.TRANSPORT_VPN) == true) {
            return true
        }
    }
    return false
}