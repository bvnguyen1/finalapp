package com.bignerdranch.android.redo.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TimeDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTime(time: Time)

    @Query("SELECT * FROM time_table ORDER BY date ASC")
    fun readAllData(): LiveData<List<Time>>


}