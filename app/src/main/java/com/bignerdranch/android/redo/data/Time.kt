package com.bignerdranch.android.redo.data

import java.util.*
import androidx.room.Entity

@Entity(tableName = "time_table")
data class Time(
    val comleteTime: Int,
    val totalTime: Int,
    val date: Date,
)
