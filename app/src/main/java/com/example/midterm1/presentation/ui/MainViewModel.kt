package com.example.midterm1.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.midterm1.domain.usecase.GetActivitiesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(private val getActivitiesUseCase: GetActivitiesUseCase) : ViewModel() {
    private val _activities = MutableStateFlow<List<String>>(emptyList())
    val activities: StateFlow<List<String>> get() = _activities

    fun getActivities() {
        viewModelScope.launch {
            _activities.value = getActivitiesUseCase.execute()  // Получаем новые данные
        }
    }
}
