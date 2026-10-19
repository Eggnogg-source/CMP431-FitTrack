package com.example.fittrack.data

import com.example.fittrack.model.Exercise
import com.example.fittrack.model.ExerciseCategory

object ExerciseDataSource {
    val exerciseList: List<Exercise> = listOf(
        // Will be adding tips later in full, still have to do further research.
        // Cardio First
        Exercise("c_01", "Outdoor Running", ExerciseCategory.CARDIO, "Intermediate", "Maintain an upright posture, steady cadence, and smooth heel-to-toe transition, making sure not to place crushing steps.", 11.5),
        Exercise("c_02", "Brisk Walking", ExerciseCategory.CARDIO, "Beginner", "Maintain a comfortable pace with active arm swing and core engagement.", 5.6),
        Exercise("c_03", "Swimming", ExerciseCategory.CARDIO, "Intermediate", "With a style of choice (Freestyle preferably), perform continuous laps with a steady rhythm in your breathing.", 7.5),
        Exercise("c_04", "Stationary Cycling", ExerciseCategory.CARDIO, "Beginner", "Keep high pedal cadence with moderate resistance and a neutral spine.", 11.0),
        Exercise("c_05", "Stair Climbing", ExerciseCategory.CARDIO, "Intermediate", "Take steady steps without leaning heavily on handrails to maximize leg drive, managing your breathing the entire time.", 10.5),
        Exercise("c_06", "Jump Rope", ExerciseCategory.CARDIO, "Advanced", "Bounce lightly on the balls of your feet with wrists rotating smoothly as you toss the rope underneath yourself.", 12.0),

        // Strength
        Exercise("s_01", "Barbell Squats", ExerciseCategory.STRENGTH, "Intermediate", "Lower hips back and down until thighs are parallel, driving up through mid-foot, and ensuring back stability.", 11.5),
        Exercise("s_02", "Conventional Deadlifts", ExerciseCategory.STRENGTH, "Advanced", "Hinge at the hips, keep barbell close to shins, and extend hips with a flat back.", 11.0),
        Exercise("s_03", "Flat Bench Press", ExerciseCategory.STRENGTH, "Intermediate", "Lower barbell under control to mid-chest, pressing upward through the legs and with elbows at 45 degrees.", 6.5),
        Exercise("s_04", "Bodyweight Pull-Ups", ExerciseCategory.STRENGTH, "Advanced", "Grip bar slightly wider than shoulders and pull chest to bar without using momentum.", 6.5),
        Exercise("s_05", "Classic Push-Ups", ExerciseCategory.STRENGTH, "Beginner", "Keep the core tight, body rigid in a plank, and lower chest to floor.", 5.5),
        Exercise("s_06", "Dumbbell Bicep Curls", ExerciseCategory.STRENGTH, "Beginner", "Keep elbows locked near ribs while curling weights upward through full range.", 4.5),

        // Flexibility
        Exercise("f_01", "Power Yoga Flow", ExerciseCategory.FLEXIBILITY, "Intermediate", "Flow continuously between warrior poses, sun salutations, and balance holds.", 5.5),
        Exercise("f_02", "Static Hamstring Stretch", ExerciseCategory.FLEXIBILITY, "Beginner", "Extend legs forward and hinge at hips toward toes without rounding upper back.", 2.5),
        Exercise("f_03", "Dynamic Leg Swings", ExerciseCategory.FLEXIBILITY, "Beginner", "Swing leg smoothly front-to-back while maintaining upright torso control.", 4.5),
        Exercise("f_04", "Cat-Cow Flow", ExerciseCategory.FLEXIBILITY, "Beginner", "Alternate smoothly between arching and rounding your spine on hands and knees.", 3.5),
        Exercise("f_05", "Downward Dog", ExerciseCategory.FLEXIBILITY, "Intermediate", "Press palms flat, drive tailbone upward, and sink heels toward the floor.", 4.0),
        Exercise("f_06", "Pigeon Pose", ExerciseCategory.FLEXIBILITY, "Advanced", "Square hips forward to release tension deeply through outer hip and glute.", 4.5),

        // HIIT 
        Exercise("h_01", "Full Burpees", ExerciseCategory.HIIT, "Advanced", "Drop chest to floor, jump feet forward, and explode vertically into an overhead jump.", 13.0),
        Exercise("h_02", "Mountain Climbers", ExerciseCategory.HIIT, "Intermediate", "Hold solid plank and drive knees alternately toward chest in rapid bursts.", 10.5),
        Exercise("h_03", "Jumping Jacks", ExerciseCategory.HIIT, "Beginner", "Jump feet wide while bringing arms overhead, then return smoothly.", 8.0),
        Exercise("h_04", "High Knees", ExerciseCategory.HIIT, "Beginner", "Sprint in place while aggressively driving knees up above hip height.", 11.0),
        Exercise("h_05", "Box Jumps", ExerciseCategory.HIIT, "Advanced", "Drop into quarter squat and explode onto box, landing softly in partial squat.", 12.5),
        Exercise("h_06", "Kettlebell Swings", ExerciseCategory.HIIT, "Intermediate", "Hinge hips forcefully to swing bell to eye level without squatting.", 12.0)
        )
}