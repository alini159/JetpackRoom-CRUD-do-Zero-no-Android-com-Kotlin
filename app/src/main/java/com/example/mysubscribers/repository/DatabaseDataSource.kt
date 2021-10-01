package com.example.mysubscribers.repository

import androidx.lifecycle.LiveData
import com.example.mysubscribers.data.db.dao.SubscriberDAO
import com.example.mysubscribers.data.db.entidy.SubscriberEntidy

class DatabaseDataSource(
    private val subscriberDAO: SubscriberDAO
):SubscriberRepository {

    override suspend fun insertSubscriber(name: String, email: String): Long {
       val subscriber = SubscriberEntidy(
           name = name,
           email = email
       )
        return subscriberDAO.insert(subscriber)
    }

    override suspend fun updateSubscriber(id: Long, name: String, email: String) {
        val subscriber = SubscriberEntidy(
            id = id,
            name = name,
            email = email
        )
        subscriberDAO.update(subscriber)
    }

    override suspend fun deleteSubscriber(id: Long) {
       subscriberDAO.delete(id)
    }

    override suspend fun deleteAllSubscriber() {
       subscriberDAO.deleteAll()
    }

    override suspend fun getAllSubscriber(): LiveData<List<SubscriberEntidy>> {
        return subscriberDAO.getAll()
    }
}