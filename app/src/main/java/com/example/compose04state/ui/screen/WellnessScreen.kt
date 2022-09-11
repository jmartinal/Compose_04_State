package com.example.compose04state.ui.screen

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose04state.data.WellnessTask
import com.example.compose04state.data.getWellnessTasks
import com.example.compose04state.ui.theme.Compose04StateTheme
import com.example.compose04state.ui.widget.StatefulWaterCounter
import com.example.compose04state.ui.widget.WellnessTasksList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulWaterCounter()

        val tasks = remember { WellnessTask.getWellnessTasks().toMutableStateList() }
        WellnessTasksList(tasks = tasks, onDismissTask = { task -> tasks.remove(task) })
    }
}

@Preview(name = "light", showBackground = true)
@Composable
fun WellnessScreenLight() {
    Compose04StateTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            WellnessScreen()
        }
    }
}

@Preview(name = "dark", showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun WellnessScreenDark() {
    Compose04StateTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            WellnessScreen()
        }
    }
}