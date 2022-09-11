package com.example.compose04state.ui.widget

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose04state.ui.theme.Compose04StateTheme

@Composable
fun StatefulWaterCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessWaterCounter(
        value = count,
        onValueChanged = { count++ },
        modifier = modifier
    )
}

@Composable
fun StatelessWaterCounter(modifier: Modifier = Modifier, value: Int, onValueChanged: () -> Unit) {
    Column(modifier = modifier.padding(16.dp)) {
        if (value > 0) {
            Text(
                text = "You've had $value glasses.",
                modifier = Modifier.padding(top = 8.dp)
            )
        }
        Button(
            onClick = onValueChanged,
            enabled = value < 10,
            modifier = modifier
                .padding(top = 8.dp, end = 8.dp)
        ) {
            Text(text = "Add one")
        }
    }
}

@Preview(name = "light", showBackground = true)
@Composable
private fun WaterCounterLight() {
    Compose04StateTheme {
        Surface {
            StatelessWaterCounter(value = 0, onValueChanged = { /* no-op */ })
        }
    }
}

@Preview(name = "dark", showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun WaterCounterDark() {
    Compose04StateTheme {
        Surface {
            StatelessWaterCounter(value = 0, onValueChanged = { /* no-op */ })
        }
    }
}
