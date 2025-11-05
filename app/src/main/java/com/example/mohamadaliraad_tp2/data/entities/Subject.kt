package com.example.mohamadaliraad_tp2.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName= "subjects")
data class Subject(
    @PrimaryKey(autoGenerate = true) val subjectId: Inst =0,
    val name: String,
    val color: String = "#2196F3",
    val teacher: String? = null,
    val notes: String? = null
)
