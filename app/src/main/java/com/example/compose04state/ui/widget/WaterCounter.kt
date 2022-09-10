package com.example.compose04state.ui.widget

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose04state.ui.theme.Compose04StateTheme

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    val count = 0
    Text(
        text = "You've had $count glasses.",
        modifier = modifier.padding(16.dp)
    )
}

@Composable
@Preview(
    name = "light",
    showBackground = true
)
fun WaterCounterLight() {
    Compose04StateTheme {
        Surface {
            WaterCounter()
        }
    }
}

@Composable
@Preview(
    name = "dark",
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES
)
fun WaterCounterDark() {
    Compose04StateTheme {
        Surface {
            WaterCounter()
        }
    }
}