package com.example.compose04state.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class WellnessTask(
    val id: Int,
    val label: String,
    initialChecked: Boolean = false
) {
    var checked by mutableStateOf(initialChecked)

    companion object
}

fun WellnessTask.Companion.getWellnessTasks() = List(30) { i ->
    WellnessTask(i, "Task #$i")
}
