package com.example.mysubscribers.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.mysubscribers.data.db.entidy.SubscriberEntidy

@Dao
interface SubscriberDAO {

    @Insert
    suspend fun insert(subscriber: SubscriberEntidy): Long

    @Update
    suspend fun update(subscriber: SubscriberEntidy)

    @Query("DELETE FROM subscriber WHERE Id = :id")
    suspend fun delete(id: Long)

    @Query("DELETE FROM subscriber")
    suspend fun deleteAll()

    @Query("SELECT * FROM subscriber")
    fun getAll(): LiveData<List<SubscriberEntidy>>



}