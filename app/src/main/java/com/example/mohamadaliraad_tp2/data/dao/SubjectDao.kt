package com.example.mohamadaliraad_tp2.data.dao

import androidx.room.*
import com.example.MohamadAliRaad_TP2.data.entities.Subject
import kotlinx.coroutines.flow.Flow
@Dao
interface SubjectDao{
    @Query("SELECT * FROM subjects ORDER BY name ASC")
    fun getAllSubjects(): Flow<List<Subject>>

    @Insert (onConflict =onConflictStrategy.REPLACE)
    suspend fun insert(subject: Subject): Long
    @Update
    suspend fun update (subject: Subject)

    @Delete
    suspend fun delete (subject: Subject)
}