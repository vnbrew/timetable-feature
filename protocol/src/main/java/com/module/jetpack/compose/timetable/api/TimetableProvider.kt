package com.module.jetpack.compose.timetable.api

import androidx.compose.runtime.compositionLocalOf

interface TimetableProvider

val LocalTimetableProvider = compositionLocalOf<TimetableProvider> {
    error("No Timetable provider found!")
}