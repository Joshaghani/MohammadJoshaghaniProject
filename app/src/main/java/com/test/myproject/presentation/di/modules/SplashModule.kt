package com.test.myproject.presentation.di.modules

import com.test.myproject.data.managers.SplashService
import com.test.myproject.data.managers.SplashServiceImpl
import com.test.myproject.presentation.base.BaseHandler
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
class SplashModule {

    @Singleton
    @Provides
    fun providesApi(client: HttpClient): SplashService {
        return SplashServiceImpl(client)
    }


}