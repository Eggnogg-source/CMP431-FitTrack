package com.example.fittrack.ui

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
import com.example.fittrack.model.WorkoutLog

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(
    totalWorkout: Int = 0,
    totalMinutes: Double = 0.0,
    historyLogs: List<WorkoutLog> = emptyList(),
    onCategoryClick: (String) -> Unit = {},
    onClearLogsClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.dashboard_title)) }
            )
        },
        modifier = modifier
        // Apply innerPadding so content doesn't render behind the TopAppBar
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = stringResource(R.string.activity_summary),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = stringResource(R.string.total_workouts_format, totalWorkout))
                    Text(text = stringResource(R.string.total_minutes_format, totalMinutes.toInt()))
                }
            }

            Text(
                text = stringResource(R.string.workout_categories),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = { onCategoryClick("Cardio") },
                    modifier = Modifier.weight(1f)
                ) {
                    Text(stringResource(R.string.category_cardio))
                }
                Button(
                    onClick = { onCategoryClick("Strength") },
                    modifier = Modifier.weight(1f)
                ) {
                    Text(stringResource(R.string.category_strength))
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = { onCategoryClick("Flexibility") },
                    modifier = Modifier.weight(1f)
                ) {
                    Text(stringResource(R.string.category_flexibility))
                }
                Button(
                    onClick = { onCategoryClick("HIIT") },
                    modifier = Modifier.weight(1f)
                ) {
                    Text(stringResource(R.string.category_hiit))
                }
            }

            Text(
                text = stringResource(R.string.recent_activities),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )

            if (historyLogs.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = stringResource(R.string.empty_logs_placeholder),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.outline
                    )
                }
            } else {
                //Swapped placeholder box for LazyColumn with stable keys, hurray!
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(
                        items = historyLogs,
                        key = { log -> log.id }
                    ) { log ->
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.surfaceVariant
                            )
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(12.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column {
                                    Text(
                                        text = log.exerciseName,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp
                                    )
                                    Text(
                                        text = stringResource(R.string.log_duration_format, log.durationMins.toInt()),
                                        style = MaterialTheme.typography.bodySmall
                                    )
                                }
                                Text(
                                    text = stringResource(R.string.log_calories_format, log.calsBurned.toInt()),
                                    fontWeight = FontWeight.SemiBold,
                                    color = MaterialTheme.colorScheme.primary
                                )
                            }
                        }
                    }
                }
            }

            Button(
                onClick = onClearLogsClick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.error
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.clear_logs_btn))
            }
        }
    }
}

@Preview
@Composable
private fun DashboardPreview() {
    DashboardScreen()
}