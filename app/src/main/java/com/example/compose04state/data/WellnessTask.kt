package com.example.compose04state.data

data class WellnessTask(val id: Int, val label: String) {
    companion object
}

fun WellnessTask.Companion.getWellnessTasks() = List(30) { i ->
    WellnessTask(i, "Task #$i")
}
