package com.example.my.roomlivedatatutorial

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(User::class), version=1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getUserDao() : UserDao
}

