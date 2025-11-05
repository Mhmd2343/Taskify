package com.example.studyfocus.repository

import com.example.MohamadAliRaad_TP2.data.dao.SubjectDao
import com.example.MohamadAliRaad_TP2.data.entities.Subject
import kotlinx.coroutines.flow.Flow

class SubjectRepository(private val subjectDao: SubjectDao) {
    val allSubjects: Flow<List<Subject>> = subjectDao.getAllSubjects()

    suspend fun insert(subject: Subject): Long = subjectDao.insert(subject)
    suspend fun update(subject: Subject) = subjectDao.update(subject)
    suspend fun delete(subject: Subject) = subjectDao.delete(subject)
}
