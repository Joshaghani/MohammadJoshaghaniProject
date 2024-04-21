package com.test.myproject.data.database.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.test.myproject.data.database.room.entities.Person
import com.test.myproject.data.database.room.entities.PersonDao


@Database(
    entities = [Person::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract val dao: PersonDao

}