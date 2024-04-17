package com.example.doubletapphomework4.ui.screens.task_editor.models

import com.example.doubletapphomework4.ui.common.enums.HabitFieldType
import com.example.doubletapphomework4.ui.common.enums.HabitPriority
import com.example.doubletapphomework4.ui.common.enums.HabitType
import com.example.doubletapphomework4.ui.common.models.HabitData

sealed class TaskEditorEvent {
    data class ChangeFieldText(val type: HabitFieldType, val text: String) : TaskEditorEvent()
    data class ChangePriority(val priority: HabitPriority) : TaskEditorEvent()
    data class ChangeHabitType(val type: HabitType) : TaskEditorEvent()

    data class UploadHabit(val habitData: HabitData) : TaskEditorEvent()

    data object ClickBtnSave : TaskEditorEvent()
    data object ClickBackBtn : TaskEditorEvent()

    data object ClearViewState : TaskEditorEvent()
}