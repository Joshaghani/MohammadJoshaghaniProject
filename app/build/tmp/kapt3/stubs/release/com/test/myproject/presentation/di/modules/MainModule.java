package com.test.myproject.presentation.di.modules;

import com.test.myproject.data.managers.MainService;
import com.test.myproject.data.managers.MainServiceImpl;
import com.test.myproject.data.managers.SplashService;
import com.test.myproject.data.managers.SplashServiceImpl;
import com.test.myproject.presentation.base.BaseHandler;
import com.test.myproject.presentation.screens.main.MainScreenContract;
import com.test.myproject.presentation.screens.main.MainScreenHandler;
import com.test.myproject.presentation.screens.main.MainScreenViewModel;
import com.test.myproject.presentation.screens.splash.SplashScreenContract;
import com.test.myproject.presentation.screens.splash.SplashScreenHandler;
import com.test.myproject.presentation.screens.splash.SplashScreenViewModel;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/test/myproject/presentation/di/modules/MainModule;", "", "()V", "providesApi", "Lcom/test/myproject/data/managers/MainService;", "client", "Lio/ktor/client/HttpClient;", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class MainModule {
    
    public MainModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.data.managers.MainService providesApi(@org.jetbrains.annotations.NotNull
    io.ktor.client.HttpClient client) {
        return null;
    }
}