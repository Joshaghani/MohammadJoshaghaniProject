package com.test.myproject.presentation.di.modules

import com.test.myproject.data.database.repository.RegisterRepository
import com.test.myproject.data.database.room.entities.PersonDao
import com.test.myproject.data.managers.RegisterService
import com.test.myproject.data.managers.RegisterServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RegisterModule {

    @Singleton
    @Provides
    fun providesApi(client: HttpClient): RegisterService {
        return RegisterServiceImpl(client)
    }

    @Singleton
    @Provides
    fun providesRepository(dao: PersonDao): RegisterRepository {
        return RegisterRepository(dao)
    }


}