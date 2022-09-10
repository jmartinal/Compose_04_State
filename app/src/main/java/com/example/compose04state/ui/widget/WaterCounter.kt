package com.example.compose04state.ui.widget

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Column
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
    var count = 0
    Column(modifier = modifier.padding(16.dp)) {
        Text(text = "You've had $count glasses.")
        Button(onClick = { count++ }) {
            Text(text = "Add one")
        }
    }
}

@Preview(name = "light", showBackground = true)
@Composable
fun WaterCounterLight() {
    Compose04StateTheme {
        Surface {
            WaterCounter()
        }
    }
}

@Preview(name = "dark", showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun WaterCounterDark() {
    Compose04StateTheme {
        Surface {
            WaterCounter()
        }
    }
}
