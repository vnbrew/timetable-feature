package com.module.jetpack.compose.timetable.api

import com.module.jetpack.compose.common.ComposableFeatureEntry

abstract class TimetableEntry : ComposableFeatureEntry {

    final override val featureRoute = "timetable-feature"

    fun destination(): String = featureRoute
}