package com.test.myproject.presentation.di.modules

import com.test.myproject.data.database.repository.LoginRepository
import com.test.myproject.data.database.room.entities.PersonDao
import com.test.myproject.data.managers.LoginService
import com.test.myproject.data.managers.LoginServiceImpl
import com.test.myproject.presentation.utilities.LoginState
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class LoginModule {

    @Singleton
    @Provides
    fun providesApi(client: HttpClient): LoginService {
        return LoginServiceImpl(client)
    }

    @Singleton
    @Provides
    fun providesRepository(dao: PersonDao): LoginRepository {
        return LoginRepository(dao)
    }

    @Singleton
    @Provides
    fun providesLoginState(): LoginState {
        return LoginState()
    }

}