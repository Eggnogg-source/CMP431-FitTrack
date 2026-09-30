package com.example.fittrack.data

import com.example.fittrack.model.Exercise
import com.example.fittrack.model.ExerciseCategory

object ExerciseDataSource {
    val exerciseList: List<Exercise> = listOf(
        // Cardio First
        Exercise("ex_01", "Running", ExerciseCategory.CARDIO, 11.5),
        Exercise("ex_02", "Walking", ExerciseCategory.CARDIO,  5.6),
        Exercise("ex_03", "Swimming", ExerciseCategory.CARDIO, 7.5),
        Exercise("ex_04", "Cycling", ExerciseCategory.CARDIO, 11.0),
        Exercise("ex_05", "Stair Climbing", ExerciseCategory.CARDIO, 10.5),
        // Strength Second
        Exercise("ex_06", "Barbell Squats", ExerciseCategory.STRENGTH, 11.5),
        Exercise("ex_07", "Deadlifts", ExerciseCategory.STRENGTH, 11.0),
        Exercise("ex_08", "Bench Press", ExerciseCategory.STRENGTH, 6.5),
        Exercise("ex_09", "Pull-Ups", ExerciseCategory.STRENGTH, 6.5),
        Exercise("ex_10", "Push-Ups", ExerciseCategory.STRENGTH, 5.5),
        Exercise("ex_11", "Bicep Curl", ExerciseCategory.STRENGTH, 4.5),
        // Will add more Flexibilty stuff verbatim in terms of certain stretches, but I wanted to at least get the uses down for now.
        Exercise("ex_12", "Power Yoga", ExerciseCategory.FLEXIBILITY, 5.5),
        Exercise("ex_13", "Static Stretching", ExerciseCategory.FLEXIBILITY, 2.5),
        Exercise("ex_14", "Dynamic Stretching", ExerciseCategory.FLEXIBILITY, 4.5),
        )
}