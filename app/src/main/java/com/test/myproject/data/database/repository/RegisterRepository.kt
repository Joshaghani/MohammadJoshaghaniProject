package com.test.myproject.data.database.repository

import com.test.myproject.data.database.room.ResponseDb
import com.test.myproject.data.database.room.entities.Person
import com.test.myproject.data.database.room.entities.PersonDao
import javax.inject.Inject

class RegisterRepository
@Inject constructor(private val dao: PersonDao) {

    suspend fun checkRegister(
        email: String,
        password: String,
        fullName: String,
        block: (ResponseDb<Person>) -> Unit
    ) {

        try {
            val newPerson = Person(
                password = password, fullName = fullName, email = email
            )
            val id = dao.insertPerson(newPerson)

            block(ResponseDb.Success(newPerson.copy(id = id.toInt())))
        } catch (e: Exception) {
            block(ResponseDb.Message("کاربری با این مشخصات وجود دارد"))
            println(e.message)
        }

    }

}