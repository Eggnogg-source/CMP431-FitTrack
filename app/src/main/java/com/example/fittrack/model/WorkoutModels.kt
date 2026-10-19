package com.example.fittrack.model

enum class ExerciseCategory {
    CARDIO,
    STRENGTH,
    FLEXIBILITY,
    HIIT
}

data class Exercise(
    val id: String,
    val name: String,
    val category: ExerciseCategory,
    val difficulty: String,
    val instructions: String,
    // tips soon to come
    val defaultCaloriesPerMinute: Double
)

data class WorkoutLog(
    val id: String,
    val exerciseName: String,
    val durationMins: Double,
    val calsBurned: Double,
    val timestampMillis: Long = System.currentTimeMillis()
)