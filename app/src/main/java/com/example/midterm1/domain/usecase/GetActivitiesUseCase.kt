package com.example.midterm1.domain.usecase

import com.example.midterm1.domain.repository.ActivityRepository

class GetActivitiesUseCase(private val repository: ActivityRepository) {
    suspend fun execute(): List<String> {
        return repository.getActivities()
    }
}