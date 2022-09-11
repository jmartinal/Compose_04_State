package com.example.compose04state.ui.screen.wellness

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.compose04state.data.WellnessTask
import com.example.compose04state.data.getWellnessTasks

class WellnessViewModel: ViewModel() {

    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    private fun getWellnessTasks(): List<WellnessTask> = WellnessTask.getWellnessTasks()

    fun removeTask(task: WellnessTask) = _tasks.remove(task)

}