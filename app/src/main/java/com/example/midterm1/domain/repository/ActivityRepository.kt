package com.example.midterm1.domain.repository

interface ActivityRepository {
    suspend fun getActivities(): List<String>
}