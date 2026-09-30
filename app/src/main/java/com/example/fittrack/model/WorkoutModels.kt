package com.example.fittrack.model

enum class ExerciseCategory {
    CARDIO,
    STRENGTH,
    FLEXIBILITY
}

data class Exercise(
    val id: String,
    val name: String,
    val category: ExerciseCategory,
    val defaultCaloriesPerMinute: Double
)

data class WorkoutLog(
    val id: String,
    val exerciseName: String,
    val durationMins: Double,
    val calsBurned: Double,
    val timestampMillis: Long = System.currentTimeMillis()
)