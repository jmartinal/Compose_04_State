package com.example.compose04state.ui.widget

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose04state.ui.theme.Compose04StateTheme

@Composable
fun WellnessTaskItem(
    taskName: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(elevation = 2.dp, modifier = modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = taskName,
                modifier = Modifier.weight(1F)
            )
            Checkbox(
                checked = checked,
                onCheckedChange = onCheckedChange
            )
            IconButton(onClick = onClose) {
                Icon(Icons.Filled.Close, contentDescription = null)
            }
        }
    }
}

@Preview(
    name = "light",
    showBackground = true
)
@Composable
private fun WellnessTaskItemLight() {
    Compose04StateTheme {
        Surface {
            WellnessTaskItem("This is a task", true, { /* no-op */ }, { /* no-op */ })
        }
    }
}

@Preview(
    name = "dark",
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
private fun WellnessTaskItemDark() {
    Compose04StateTheme {
        Surface {
            WellnessTaskItem("This is a task", true, { /* no-op */ }, { /* no-op */ })
        }
    }
}