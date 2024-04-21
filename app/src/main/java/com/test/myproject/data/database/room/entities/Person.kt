package com.test.myproject.data.database.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    indices = [Index(
        value = ["email"], unique = true
    )]
)
data class Person(
    @ColumnInfo(name = "email") val email: String,
    val password: String,
    val fullName: String,
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
)
