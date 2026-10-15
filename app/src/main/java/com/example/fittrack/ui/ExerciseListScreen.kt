package com.example.fittrack.ui

import android.R.attr.navigationIcon
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fittrack.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExerciseListScreen(
    categoryTitle: String = "Cardio",
    onExerciseClick: (String) -> Unit = {},
    onBackClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.category_exercises_title, categoryTitle)) },
            )
        },
        modifier = Modifier
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Will put the rest of the exercises here when I get the other category down For now, we got 3 things.
            // Also, had the idea to add small tips for each exercise. Might flesh it out proper later with further research
            // might not, we'll see.
            ExerciseItemCard(
                name = "Classic Push-ups",
                difficulty = "Beginner",
                instruction = "Keep your core tight and elbows at 45 degrees.",
                tip = "",
                onClick = { onExerciseClick("ex_01")}
            )
            ExerciseItemCard(
                name = "Classic Push-ups",
                difficulty = "Beginner",
                instruction = "Keep your core tight and elbows at 45 degrees.",
                tip = "",
                onClick = { onExerciseClick("ex_01")}
            )
            ExerciseItemCard(
                name = "Classic Push-ups",
                difficulty = "Beginner",
                instruction = "Keep your core tight and elbows at 45 degrees.",
                tip = "",
                onClick = { onExerciseClick("ex_01")}
            )
        }
    }
}

@Composable
fun ExerciseItemCard(
    name: String,
    difficulty: String,
    instruction: String,
    tip: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier

) {
    Card(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = name,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                AssistChip(
                    onClick = {},
                    label = { Text(difficulty, fontSize = 12.sp)}
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = instruction,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Tip: $tip",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Preview
@Composable
private fun ExerciseListPreview() {
    ExerciseListScreen()
}
