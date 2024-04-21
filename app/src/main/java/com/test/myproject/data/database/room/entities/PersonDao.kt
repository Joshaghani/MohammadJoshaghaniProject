package com.test.myproject.data.database.room.entities

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.test.myproject.presentation.screens.login.LoginScreenContract
import kotlinx.coroutines.flow.Flow


@Dao
interface PersonDao {

    @Insert
    suspend fun insertPerson(person: Person): Long

    @Delete
    suspend fun deletePerson(person: Person): Int


    @Query("SELECT * FROM person ORDER BY fullName ASC")
    fun getPersonOrderByFullName(): Flow<List<Person>>

    @Query("SELECT * FROM person where email = :email and password = :password")
    fun getPersonOrderByEmailAndPassword(email: String, password: String): Flow<Person?>


}