package com.example.fittrack.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.fittrack.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    exerciseName: String = "Classic Push-ups",
    instructions: String = "Place palms flat on the ground shoulder-width apart. Lower your chest until near the floor, maintaining a rigid spine, and press up.",
    recommendedDuration: String = "10-15 Minutes",
    onLogWorkout: (Double) -> Unit = {},
    onBackClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    var durationText by rememberSaveable { mutableStateOf("") }

    val parsedMinutes = durationText.toDoubleOrNull()
    val isError = durationText.isNotEmpty() && (parsedMinutes == null || parsedMinutes <= 0.0)
    val isButtonEnabled = durationText.isNotEmpty() && !isError

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.log_exercise_title)) },
            )
        },
        modifier = modifier
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = exerciseName,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        text = stringResource(R.string.instructions_header),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = instructions,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = stringResource(R.string.target_duration_format, recommendedDuration),
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }

            OutlinedTextField(
                value = durationText,
                onValueChange = { durationText = it },
                label = { Text(stringResource(R.string.duration_label)) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                isError = isError,
                supportingText = {
                    if (isError) {
                        Text(
                            text = stringResource(R.string.duration_error_msg),
                            color = MaterialTheme.colorScheme.error
                        )
                    }
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            Button(
                onClick = {
                    parsedMinutes?.let { onLogWorkout(it) }
                    durationText = ""
                },
                enabled = isButtonEnabled,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.log_workout_btn))
            }
        }
    }
}

@Preview
@Composable
private fun DetailScreenPreview() {
    DetailScreen()
}