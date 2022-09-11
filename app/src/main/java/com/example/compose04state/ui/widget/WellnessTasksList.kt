package com.example.compose04state.ui.widget

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose04state.data.WellnessTask
import com.example.compose04state.data.getWellnessTasks
import com.example.compose04state.ui.theme.Compose04StateTheme

@Composable
fun WellnessTasksList(
    tasks: List<WellnessTask>,
    onDismissTask: (WellnessTask) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(items = tasks, key = { task -> task.id }) { task ->
            StatefulWellnessTaskItem(taskName = task.label, onClose = { onDismissTask(task) })
        }
    }
}

@Preview(
    name = "light",
    showBackground = true
)
@Composable
fun WellnessTasksListLight() {
    Compose04StateTheme {
        Surface {
            WellnessTasksList(WellnessTask.getWellnessTasks(), { /* no-op */ })
        }
    }
}

@Preview(
    name = "dark",
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
fun WellnessTasksListDark() {
    Compose04StateTheme {
        Surface {
            WellnessTasksList(WellnessTask.getWellnessTasks(), { /* no-op */ })
        }
    }
}