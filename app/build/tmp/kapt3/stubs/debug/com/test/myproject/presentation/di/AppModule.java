package com.test.myproject.presentation.di;

import android.content.Context;
import androidx.room.Room;
import com.test.myproject.data.database.room.AppDatabase;
import com.test.myproject.data.database.room.entities.PersonDao;
import com.test.myproject.presentation.base.IApplication;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import io.ktor.client.engine.cio.CIO;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.plugins.UserAgent;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation;
import io.ktor.client.plugins.logging.LogLevel;
import io.ktor.client.plugins.logging.Logger;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/test/myproject/presentation/di/AppModule;", "", "()V", "provideApplication", "Lcom/test/myproject/presentation/base/IApplication;", "app", "Landroid/content/Context;", "providesApiKtor", "Lio/ktor/client/HttpClient;", "providesAppDatabase", "Lcom/test/myproject/data/database/room/AppDatabase;", "providesDaoPerson", "Lcom/test/myproject/data/database/room/entities/PersonDao;", "database", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.base.IApplication provideApplication(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context app) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.data.database.room.AppDatabase providesAppDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context app) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.data.database.room.entities.PersonDao providesDaoPerson(@org.jetbrains.annotations.NotNull
    com.test.myproject.data.database.room.AppDatabase database) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final io.ktor.client.HttpClient providesApiKtor() {
        return null;
    }
}