package com.test.myproject.presentation.di.modules

import com.test.myproject.data.managers.MainService
import com.test.myproject.data.managers.MainServiceImpl
import com.test.myproject.data.managers.SplashService
import com.test.myproject.data.managers.SplashServiceImpl
import com.test.myproject.presentation.base.BaseHandler
import com.test.myproject.presentation.screens.main.MainScreenContract
import com.test.myproject.presentation.screens.main.MainScreenHandler
import com.test.myproject.presentation.screens.main.MainScreenViewModel
import com.test.myproject.presentation.screens.splash.SplashScreenContract
import com.test.myproject.presentation.screens.splash.SplashScreenHandler
import com.test.myproject.presentation.screens.splash.SplashScreenViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class MainModule {

    @Singleton
    @Provides
    fun providesApi(client: HttpClient): MainService {
        return MainServiceImpl(client)
    }


}