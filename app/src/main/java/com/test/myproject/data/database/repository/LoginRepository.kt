package com.test.myproject.data.database.repository

import com.test.myproject.data.database.room.ResponseDb
import com.test.myproject.data.database.room.entities.Person
import com.test.myproject.data.database.room.entities.PersonDao
import javax.inject.Inject

class LoginRepository
@Inject constructor(private val dao: PersonDao) {

    suspend fun checkLogin(
        email: String,
        password: String,
        block: (ResponseDb<Person>) -> Unit
    ) {

        dao.getPersonOrderByEmailAndPassword(
            email = email, password = password
        ).collect { person ->
            if (person == null) {
                block(ResponseDb.Message("کاربری با این مشخصات یافت نشد"))
            } else {
                block(ResponseDb.Success(person))
            }

        }

    }

}