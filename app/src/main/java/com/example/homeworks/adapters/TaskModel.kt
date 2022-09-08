package com.example.homeworks.adapters

import androidx.room.Entity
import java.io.Serializable

@Entity(tableName = "task_table")
data class TaskModel(

  val task:String,
  val date:String,
  val regular: String,
) : Serializable
