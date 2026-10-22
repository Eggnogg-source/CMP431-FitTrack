package com.example.fittrack.data

import com.example.fittrack.model.Exercise
import com.example.fittrack.model.ExerciseCategory

object ExerciseDataSource {
    val exerciseList: List<Exercise> = listOf(
        // Experience based and joint sparing tips curated for catalog exercises, some of my own knowledge (mainly of the first two categories), the other stuff from reddit. Sue me.
        // Cardio First
        Exercise("c_01", "Outdoor Running", ExerciseCategory.CARDIO, "Intermediate", "Maintain an upright posture, steady cadence, and smooth heel-to-toe transition, making sure not to place crushing steps.", tip = "Keep yourself leaning slightly foward, annd land midfoot rather than over-striding onto your heels. Your knees and shins won't break this way.", 11.5),
        Exercise("c_02", "Brisk Walking", ExerciseCategory.CARDIO, "Beginner", "Maintain a comfortable pace with active arm swing and core engagement.", tip = "Imagine pushing through your big toe at the end of each step to engage your glutes, and ease lower back tension", 5.6),
        Exercise("c_03", "Swimming", ExerciseCategory.CARDIO, "Intermediate", "With a style of choice (Freestyle preferably), perform continuous laps with a steady rhythm in your breathing.", tip = "When swimming, your head angle is everything. Keep your gaze down toward the pool floor instead of forward so your hips stay leveled.", 7.5),
        Exercise("c_04", "Stationary Cycling", ExerciseCategory.CARDIO, "Beginner", "Keep high pedal cadence with moderate resistance and a neutral spine.", tip = "Adjust seat height so your knee has a slight 30° bend at the bottom, avoids strain.", 11.0),
        Exercise("c_05", "Stair Climbing", ExerciseCategory.CARDIO, "Intermediate", "Take steady steps without leaning heavily on handrails to maximize leg drive, managing your breathing the entire time.", tip = "For the love of everything, place your whole foot on each step, not just your toes. It will overload the knees, the whole foot engages the thigh.", 10.5),
        Exercise("c_06", "Jump Rope", ExerciseCategory.CARDIO, "Advanced", "Bounce lightly on the balls of your feet with wrists rotating smoothly as you toss the rope underneath yourself.", tip = "You don't have to jump high at all. An inch off the floor with soft knees to absorb the landing is enough.", 12.0),

        // Strength
        Exercise("s_01", "Barbell Squats", ExerciseCategory.STRENGTH, "Intermediate", "Lower hips back and down until thighs are parallel, driving up through mid-foot, and ensuring back stability.", tip = "Grip the floor with your toes and 'spread the floor' with your feet to activate outer glutes within the pushing movement.", 11.5),
        Exercise("s_02", "Conventional Deadlifts", ExerciseCategory.STRENGTH, "Advanced", "Hinge at the hips, keep barbell close to shins, and extend hips with a flat back.", tip = "Pull the slack out of the bar before lifting, and squeeze your armpits tight to protect your lower spine. Feel free to triple check your posture.", 11.0),
        Exercise("s_03", "Flat Bench Press", ExerciseCategory.STRENGTH, "Intermediate", "Lower the bar under control to mid-chest, pressing upward through the legs and with elbows at 45 degrees.", tip = "Squeeze your shoulder blades back and down into the bench so more of your chest bears the load instead of your front delts.", 6.5),
        Exercise("s_04", "Bodyweight Pull-Ups", ExerciseCategory.STRENGTH, "Advanced", "Grip bar slightly wider than shoulders and pull chest to bar without using momentum.", tip = "Depress your shoulders downward before bending your elbows to focus your back over your wrists.", 6.5),
        Exercise("s_05", "Classic Push-Ups", ExerciseCategory.STRENGTH, "Beginner", "Keep the core tight, body rigid in a plank, and lower chest to floor.", tip = "Screw your palms outward into the floor to lock your shoulders into external rotation and save your elbows the tension.", 5.5),
        Exercise("s_06", "Dumbbell Bicep Curls", ExerciseCategory.STRENGTH, "Beginner", "Keep elbows locked near ribs while curling weights upward through full range.", tip = "Keep your wrists neutral or slightly extended, keeping the tension on the bicep.", 4.5),

        // Flexibility
        Exercise("f_01", "Power Yoga Flow", ExerciseCategory.FLEXIBILITY, "Intermediate", "Flow continuously between warrior poses, sun salutations, and balance holds.", tip = "Coordinate every movement with your breath, exhaling through transitions relaxes your muscles and helps you sink deeper.", 5.5),
        Exercise("f_02", "Static Hamstring Stretch", ExerciseCategory.FLEXIBILITY, "Beginner", "Extend legs forward and hinge at hips toward toes without rounding upper back.", tip = "Keep a micro-bend in your knees; locking them transfers tension to the sciatic nerve rather than stretching the hamstring belly.", 2.5),
        Exercise("f_03", "Dynamic Leg Swings", ExerciseCategory.FLEXIBILITY, "Beginner", "Swing leg smoothly front-to-back while maintaining upright torso control.", tip = "Brace your core so your pelvis avoids pinching your lumbar joints.", 4.5),
        Exercise("f_04", "Cat-Cow Flow", ExerciseCategory.FLEXIBILITY, "Beginner", "Alternate smoothly between arching and rounding your spine on hands and knees.", tip = "Stack wrists directly below shoulders and spread fingers wide to distribute weight across your entire palm.", 3.5),
        Exercise("f_05", "Downward Dog", ExerciseCategory.FLEXIBILITY, "Intermediate", "Press palms flat, drive tailbone upward, and sink heels toward the floor.", tip = "Bend your knees as much as needed to prioritize a flat spine over getting your heels all the way to the mat.", 4.0),
        Exercise("f_06", "Pigeon Pose", ExerciseCategory.FLEXIBILITY, "Advanced", "Square hips forward to release tension deeply through outer hip and glute.", tip = "Place a yoga block or rolled towel under your front hip if it floats off the mat to keep your pelvis level and knee safe", 4.5),

        // HIIT 
        Exercise("h_01", "Full Burpees", ExerciseCategory.HIIT, "Advanced", "Drop chest to floor, jump feet forward, and explode vertically into an overhead jump.", tip = "Land with your feet wider than your hands when jumping up from the floor to spare your lower back.", 13.0),
        Exercise("h_02", "Mountain Climbers", ExerciseCategory.HIIT, "Intermediate", "Hold solid plank and drive knees alternately toward chest in rapid bursts.", tip = "Keep your shoulders directly over your wrists rather than drifting back, which will strain your rotator cuffs.", 10.5),
        Exercise("h_03", "Jumping Jacks", ExerciseCategory.HIIT, "Beginner", "Jump feet wide while bringing arms overhead, then return smoothly.", tip = "Stay light on the balls of your feet and keep a soft bend in your knees upon landing to protect your hips and ankles.", 8.0),
        Exercise("h_04", "High Knees", ExerciseCategory.HIIT, "Beginner", "Sprint in place while aggressively driving knees up above hip height.", tip = "Lean slightly forward from the ankles, not the hips, so your core pulls your knees up rather than your hip flexors doing all the work.", 11.0),
        Exercise("h_05", "Box Jumps", ExerciseCategory.HIIT, "Advanced", "Drop into quarter squat and explode onto box, landing softly in partial squat.", tip = "Step down one foot at a time rather than jumping backward off the box to eliminate tendon impact.", 12.5),
        Exercise("h_06", "Kettlebell Swings", ExerciseCategory.HIIT, "Intermediate", "Hinge hips forcefully to swing bell to eye level without squatting.", tip = "Avoid hinging early. Wait until your forearms contact your inner thighs before hinging backward.", 12.0)
        )
}