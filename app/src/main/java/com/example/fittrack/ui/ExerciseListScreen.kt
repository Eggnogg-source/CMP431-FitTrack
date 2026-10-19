package com.example.fittrack.ui
// forgot how to implement the icon for the back arrow so please forgive me if it looks sus, i had to search for it.
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.example.fittrack.data.ExerciseDataSource
import com.example.fittrack.model.Exercise

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExerciseListScreen(
    categoryTitle: String = "Cardio",
    exercises: List<Exercise> = ExerciseDataSource.exerciseList.filter {
        it.category.name.equals(categoryTitle, ignoreCase = true)
    },
    onExerciseClick: (String) -> Unit = {},
    onBackClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.category_exercises_title, categoryTitle)) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back_button)
                        )
                    }
                }
            )
        },
        modifier = modifier
    ) { innerPadding ->
        // Using exercise.id as stable key to avoid full list recomposition on scroll
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            items(
                items = exercises,
                key = { exercise -> exercise.id }
            ) { exercise ->
                ExerciseItemCard(
                    name = exercise.name,
                    difficulty = exercise.difficulty,
                    instruction = exercise.instructions,
                    tip = "Stay controlled through the full range of motion.",
                    onClick = { onExerciseClick(exercise.id) }
                )
            }
        }
    }
}

// Default filter loads matching category from ExerciseDataSource for now.
// Will hoist to ViewModel state in the next episode of Dragon Ball C (my next push).
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
                    label = { Text(difficulty, fontSize = 12.sp) }
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