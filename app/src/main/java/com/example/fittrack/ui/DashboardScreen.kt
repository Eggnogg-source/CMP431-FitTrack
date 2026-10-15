package com.example.fittrack.ui
import com.example.fittrack.R
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(
    totalWorkout: Int = 0,
    totalMinutes: Double = 0.0,
    onCategoryClick: (String) -> Unit = {},
    onClearLogsClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.dasboard_title))}
            )
    },
        modifier = Modifier
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(
                modifier = Modifier,
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)){
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
                    onClick = {onCategoryClick("Cardio")},
                    modifier = Modifier.weight(1f)
                ) {
                    Text(stringResource(R.string.category_cardio))
                }
            Button(
                onClick = {onCategoryClick("Strength")},
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
                    onClick = {onCategoryClick("Flexibility")},
                    modifier = Modifier.weight(1f)
                ) {
                    Text(stringResource(R.string.category_flexibility))
                }
                // just realized im missing a 4th category, will add next push after some research. 눈_눈
                Button(
                    onClick = {onCategoryClick("")},
                    modifier = Modifier.weight(1f)
                ) {
                    Text(stringResource(R.string.placeholderText))
                }
            }

            Text(
                text = stringResource(R.string.recent_activities),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )

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

