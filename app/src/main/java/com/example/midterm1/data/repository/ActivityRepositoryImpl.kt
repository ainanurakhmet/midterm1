package com.example.midterm1.data.repository

import com.example.midterm1.domain.repository.ActivityRepository

class ActivityRepositoryImpl : ActivityRepository {
    override suspend fun getActivities(): List<String> {
        return listOf("Танцы", "Волейбол")
    }
}