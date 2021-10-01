package com.example.mysubscribers.repository

import androidx.lifecycle.LiveData
import com.example.mysubscribers.data.db.entidy.SubscriberEntidy

interface SubscriberRepository {

    suspend fun insertSubscriber(name: String, email: String): Long

    suspend fun updateSubscriber(id: Long, name:String, email: String)

    suspend fun deleteSubscriber(id: Long)

    suspend fun getAllSubscriber(): LiveData<List<SubscriberEntidy>>
    suspend fun deleteAllSubscriber()
}