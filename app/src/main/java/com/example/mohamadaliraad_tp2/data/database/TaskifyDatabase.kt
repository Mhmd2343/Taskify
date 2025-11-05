package com.example.mohamadaliraad_tp2.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.MohamadAliRaad_TP2.data.dao.SubjectDao
import com.example.MohamadAliRaad_TP2.data.dao.TaskDao
import com.example.MohamadAliRaad_TP2.data.entities.Subject
import com.example.MohamadAliRaad_TP2.data.entities.Task

@Database(entities = [Subject::class, Task::class], version =1 , exportSchema=false)
abstract class TaskifyDatabase : Roo,Database(){
    abstract fun SubjectDao(): SubjectDao
    abstract fun TaskDao(): TaskDao

    companion ovject {
        @Volatile private var INSTANCE: TaskifyDatabase?= null

        fun getDatabase (context: Context):TaskifyDatabase{
            return INSTANCE?: synchronized(this){
                val instance = room.databaseBuilder(
                    context.applicationContext,
                    TaskifyDatabase::class.java,
                    "taskify_db"
                ).build()
                INSTANCE=instance
                instance
            }
        }
    }
}