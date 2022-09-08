package com.example.homeworks

import com.example.homeworks.room.TaskModel

interface ItemListener {
    fun itemUpDate(taskModel: TaskModel)
    fun delete (taskModel: TaskModel)
}