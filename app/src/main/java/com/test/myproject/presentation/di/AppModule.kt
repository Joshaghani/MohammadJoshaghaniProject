package com.test.myproject.presentation.di

import android.content.Context
import androidx.room.Room
import com.test.myproject.data.database.room.AppDatabase
import com.test.myproject.data.database.room.entities.PersonDao
import com.test.myproject.presentation.base.IApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.UserAgent
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.observer.ResponseObserver
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): IApplication {
        return app as IApplication
    }


    @Singleton
    @Provides
    fun providesAppDatabase(@ApplicationContext app: Context): AppDatabase {
        return Room.databaseBuilder(app, AppDatabase::class.java, "Sample.db")
            .createFromAsset("database/myapp.db")
            .build()
    }

    @Singleton
    @Provides
    fun providesDaoPerson(database: AppDatabase): PersonDao {
        return database.dao
    }

    @Singleton
    @Provides
    fun providesApiKtor(): HttpClient {
        return HttpClient(CIO) {

            install(HttpTimeout) {
                requestTimeoutMillis = 60000 // 1 minute time out
            }

            install(Logging) {
                logger = object : Logger {
                    override fun log(message: String) {
                        println("HTTP call : $message")
                    }
                }
                level = LogLevel.ALL

            }

            install(ContentNegotiation) {

                json(Json {
                    encodeDefaults = true
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }

            install(UserAgent) {
                agent = "Android"
            }

            install(ResponseObserver) {
                onResponse {}
            }

        }
    }


}