package com.example.mohamadaliraad_tp2.data.entities

import androidx.room.Entity
import androidx.room.ForeighKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName="tasks",
    foreignKeys = [ForeignKey(
        entity = Subject::class,
        parentColumns = ["subjectId"],
        childColumns = ["subjectId"],
        onDelete = ForeighKey.CASCADE
    )],
    indices = [Index("subjectId")]
)

data class Task(
    @PrimaryKey(autoGenerate = true) val taskId : Int =0,
    val title : String,
    val description : String?=null,
    val dueDate: Long = System.currentTimeMillis(),
    val priority: Int = 2, // 1= high, 2..., 3 = low
    val completed: Boolean = false,
    val subjectId : Int // ForeignKey
)