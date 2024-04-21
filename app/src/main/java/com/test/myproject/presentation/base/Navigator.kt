package com.test.myproject.presentation.base

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.test.myproject.presentation.base.baseScreen.RootScreen


object Navigator {


    private var stack = mutableListOf<RootScreen<*, *, *, *>>()

    var currentScreen: MutableState<RootScreen<*, *, *, *>?> = mutableStateOf(stack.lastOrNull())


    fun isMainScreen(): Boolean {
        return stack.size == 1
    }

    fun add(screen: RootScreen<*, *, *, *>) {
        stack.add(screen)
        currentScreen.value = stack.last()
    }

    fun remove(screen: RootScreen<*, *, *, *>): Boolean {
        if (stack.size > 1) {
            stack.remove(screen)
            currentScreen.value = stack.last()
            currentScreen.value!!.onRestart()
            return true
        }
        return false
    }

    fun clear() {
        stack.clear()
    }

}