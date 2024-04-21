package com.test.myproject.data.database.repository;

import com.test.myproject.data.database.room.ResponseDb;
import com.test.myproject.data.database.room.entities.Person;
import com.test.myproject.data.database.room.entities.PersonDao;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0086@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/test/myproject/data/database/repository/LoginRepository;", "", "dao", "Lcom/test/myproject/data/database/room/entities/PersonDao;", "(Lcom/test/myproject/data/database/room/entities/PersonDao;)V", "checkLogin", "", "email", "", "password", "block", "Lkotlin/Function1;", "Lcom/test/myproject/data/database/room/ResponseDb;", "Lcom/test/myproject/data/database/room/entities/Person;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginRepository {
    @org.jetbrains.annotations.NotNull
    private final com.test.myproject.data.database.room.entities.PersonDao dao = null;
    
    @javax.inject.Inject
    public LoginRepository(@org.jetbrains.annotations.NotNull
    com.test.myproject.data.database.room.entities.PersonDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object checkLogin(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.test.myproject.data.database.room.ResponseDb<com.test.myproject.data.database.room.entities.Person>, kotlin.Unit> block, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}