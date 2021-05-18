package com.bignerdranch.android.redo.data

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Time::class], version = 1, exportSchema = false)
abstract class TimeDatabase: RoomDatabase() {

    abstract fun timeDao(): TimeDao



}