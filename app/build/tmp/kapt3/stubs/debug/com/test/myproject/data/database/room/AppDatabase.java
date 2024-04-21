package com.test.myproject.data.database.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.test.myproject.data.database.room.entities.Person;
import com.test.myproject.data.database.room.entities.PersonDao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/test/myproject/data/database/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dao", "Lcom/test/myproject/data/database/room/entities/PersonDao;", "getDao", "()Lcom/test/myproject/data/database/room/entities/PersonDao;", "app_debug"})
@androidx.room.Database(entities = {com.test.myproject.data.database.room.entities.Person.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.test.myproject.data.database.room.entities.PersonDao getDao();
}