package com.test.myproject.presentation.di.modules;

import com.test.myproject.data.database.repository.LoginRepository;
import com.test.myproject.data.database.room.entities.PersonDao;
import com.test.myproject.data.managers.LoginService;
import com.test.myproject.data.managers.LoginServiceImpl;
import com.test.myproject.presentation.utilities.LoginState;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/test/myproject/presentation/di/modules/LoginModule;", "", "()V", "providesApi", "Lcom/test/myproject/data/managers/LoginService;", "client", "Lio/ktor/client/HttpClient;", "providesLoginState", "Lcom/test/myproject/presentation/utilities/LoginState;", "providesRepository", "Lcom/test/myproject/data/database/repository/LoginRepository;", "dao", "Lcom/test/myproject/data/database/room/entities/PersonDao;", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class LoginModule {
    
    public LoginModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.data.managers.LoginService providesApi(@org.jetbrains.annotations.NotNull
    io.ktor.client.HttpClient client) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.data.database.repository.LoginRepository providesRepository(@org.jetbrains.annotations.NotNull
    com.test.myproject.data.database.room.entities.PersonDao dao) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.utilities.LoginState providesLoginState() {
        return null;
    }
}