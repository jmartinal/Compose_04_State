package com.example.compose04state.ui.widget

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose04state.ui.theme.Compose04StateTheme

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            var showTask by remember { mutableStateOf(true) }
            if (showTask) {
                WellnessTaskItem(
                    taskName = "Have you taken your 15 minute walk today?",
                    onClose = { showTask = false }
                )
            }
            Text(
                text = "You've had $count glasses.",
                modifier = Modifier.padding(top = 8.dp)
            )
        }
        Row(horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = { count++ },
                enabled = count < 10,
                modifier = modifier
                    .padding(top = 8.dp, end = 8.dp)
                    .weight(1F)
            ) {
                Text(text = "Add one")
            }
            Button(
                onClick = { count = 0 },
                modifier = modifier
                    .padding(top = 8.dp, start = 8.dp)
                    .weight(1F)
            ) {
                Text(text = "Clear water count")
            }
        }
    }
}

@Preview(name = "light", showBackground = true)
@Composable
private fun WaterCounterLight() {
    Compose04StateTheme {
        Surface {
            WaterCounter()
        }
    }
}

@Preview(name = "dark", showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun WaterCounterDark() {
    Compose04StateTheme {
        Surface {
            WaterCounter()
        }
    }
}
