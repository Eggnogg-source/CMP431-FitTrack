package com.example.fittrack.viewmodel

import androidx.lifecycle.ViewModel
import com.example.fittrack.data.ExerciseDataSource
import com.example.fittrack.model.WorkoutLog
import com.example.fittrack.model.WorkoutUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.util.UUID

class FitTrackViewModel : ViewModel() {

    // Backing property pattern for state encapsulation
    private val _uiState = MutableStateFlow(WorkoutUIState())
    val uiState: StateFlow<WorkoutUIState> = _uiState.asStateFlow()

    init {
        // Load initial exercises for the default category
        selectCategory("Cardio")
    }

    fun selectCategory(category: String) {
        val filtered = ExerciseDataSource.exerciseList.filter {
            it.category.name.equals(category, ignoreCase = true)
        }
        _uiState.update { currentState ->
            currentState.copy(
                selectedCategory = category,
                exercises = filtered
            )
        }
    }

    fun logWorkout(exerciseName: String, durationMins: Double, calsPerMinute: Double) {
        val calories = durationMins * calsPerMinute
        val newLog = WorkoutLog(
            id = UUID.randomUUID().toString(),
            exerciseName = exerciseName,
            durationMins = durationMins,
            calsBurned = calories
        )

        _uiState.update { currentState ->
            currentState.copy(
                totalWorkouts = currentState.totalWorkouts + 1,
                totalMinutes = currentState.totalMinutes + durationMins,
                historyLogs = listOf(newLog) + currentState.historyLogs
            )
        }
    }

    fun clearLogs() {
        _uiState.update { currentState ->
            currentState.copy(
                totalWorkouts = 0,
                totalMinutes = 0.0,
                historyLogs = emptyList()
            )
        }
    }
}