package com.example.midterm1.di

import com.example.midterm1.data.repository.ActivityRepositoryImpl
import com.example.midterm1.domain.repository.ActivityRepository
import com.example.midterm1.domain.usecase.GetActivitiesUseCase
import com.example.midterm1.presentation.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val activityModule = module {
    viewModel { MainViewModel(get()) }

    single<ActivityRepository> { ActivityRepositoryImpl() }

    factory { GetActivitiesUseCase(get()) }
}
