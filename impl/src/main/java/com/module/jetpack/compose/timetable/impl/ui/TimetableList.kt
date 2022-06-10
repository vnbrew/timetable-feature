package com.module.jetpack.compose.timetable.impl.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.module.jetpack.compose.timetable.impl.TimetableViewModel

@Composable
fun TimetableScreen(
    viewModel: TimetableViewModel,
    onUserSelected: () -> Unit
) {
    Box {
        TimetableBody(onUserSelected)
    }
}

@Composable
fun TimetableBody(onUserSelected: () -> Unit) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = {
            onUserSelected.invoke()
        }) {
            Text(text = "Detail")
        }
    }
}