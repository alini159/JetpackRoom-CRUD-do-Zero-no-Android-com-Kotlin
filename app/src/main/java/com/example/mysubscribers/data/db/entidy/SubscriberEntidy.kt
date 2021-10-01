package com.example.mysubscribers.data.db.entidy

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subscriber")

data class SubscriberEntidy (
    @PrimaryKey(autoGenerate = true)
    val id:Long= 0,
    val name: String,
    val email: String,


 )

