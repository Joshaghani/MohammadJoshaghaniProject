package com.test.myproject.presentation.utilities

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.google.gson.Gson
import com.test.myproject.presentation.base.GlobalProperties


data class LoginModel(val email: String, val password: String) {

    fun toJsonString(): String = Gson().toJson(this)

    companion object {
        fun fromJsonStriong(json: String?) =
            json?.let { Gson().fromJson(it, LoginModel::class.java) } //serializer(), json)
    }
}

class LoginState {

    private val key = "LoginUser"

    private val sharedPreferences = GlobalProperties.currentActivity.getSharedPreferences(
        "Login_sp", MODE_PRIVATE
    )

    private var editor: SharedPreferences.Editor = sharedPreferences.edit()


    fun isLogin(): LoginModel? {
        val loginModelString = sharedPreferences.getString(key, "")
        return LoginModel.fromJsonStriong(loginModelString)
    }


    fun setLogin(username: String, password: String) {
        val loginModelString = LoginModel(username, password).toJsonString()
        editor.putString(key, loginModelString)
        editor.apply()
    }


    fun logout() {
        editor.remove(key)
        editor.commit()
        editor.apply()

        restartApplication(GlobalProperties.currentActivity)
    }


}