package com.example.fittrack.model

data class WorkoutUIState(
    val totalWorkouts: Int = 0,
    val totalMinutes: Double = 0.0,
    val historyLogs: List<WorkoutLog> = emptyList(),
    val selectedCategory: String = "Cardio",
    val exercises: List<Exercise> = emptyList()
)