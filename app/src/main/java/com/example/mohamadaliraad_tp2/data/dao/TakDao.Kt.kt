package com.example.mohamadaliraad_tp2.data.dao

import androidx.room.*
import com.MohamadAliRaad_TP2.data.entities.Task
import kotlinx.coroutines.flow.Flow
@Dao
interface TaskDao{
    @Query("SELECT * FROM tasks ORDER BY dueDate ASC")
    fun getAllTasks(): Flow<List<Task>>

    @Query ("SELECT * FROM tasks WHERE subjectId = :subjectId ORDER BY dueDate ASC")
    fun getTasksBySubject(subjectId: Int): Flow<List<Task>>

    @Insert (onConflict = onConflictStrategy.REPLACE)
    suspend fun insert(task: Task):Long

    @Update
    suspend fun update(task: Task)

    @Delete
    suspend fun delete(task: Task)
}