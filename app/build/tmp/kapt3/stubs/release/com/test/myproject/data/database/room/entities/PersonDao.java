package com.test.myproject.data.database.room.entities;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.test.myproject.presentation.screens.login.LoginScreenContract;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\bH\'J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/test/myproject/data/database/room/entities/PersonDao;", "", "deletePerson", "", "person", "Lcom/test/myproject/data/database/room/entities/Person;", "(Lcom/test/myproject/data/database/room/entities/Person;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPersonOrderByEmailAndPassword", "Lkotlinx/coroutines/flow/Flow;", "email", "", "password", "getPersonOrderByFullName", "", "insertPerson", "", "app_release"})
@androidx.room.Dao
public abstract interface PersonDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertPerson(@org.jetbrains.annotations.NotNull
    com.test.myproject.data.database.room.entities.Person person, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deletePerson(@org.jetbrains.annotations.NotNull
    com.test.myproject.data.database.room.entities.Person person, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM person ORDER BY fullName ASC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.test.myproject.data.database.room.entities.Person>> getPersonOrderByFullName();
    
    @androidx.room.Query(value = "SELECT * FROM person where email = :email and password = :password")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.test.myproject.data.database.room.entities.Person> getPersonOrderByEmailAndPassword(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password);
}