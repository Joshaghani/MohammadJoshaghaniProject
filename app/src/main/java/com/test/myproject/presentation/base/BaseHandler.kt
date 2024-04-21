package com.test.myproject.presentation.base


abstract class BaseHandler<VM : BaseViewModel<*, *, Effect>, Effect : ViewSideEffect> {
    abstract fun handleEffects(effect: Effect, viewModel: VM)
}