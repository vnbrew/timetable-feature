package com.module.jetpack.compose.timetable.impl.di

import com.module.jetpack.compose.common.di.FeatureScoped
import com.module.jetpack.compose.data.api.DataProvider
import com.module.jetpack.compose.timetable.api.TimetableProvider
import com.module.jetpack.compose.timetable.impl.TimetableViewModel
import dagger.Component

@FeatureScoped
@Component(
    dependencies = [DataProvider::class],
    modules = [TimetableModule::class]
)
interface TimetableComponent : TimetableProvider {
    val viewModel: TimetableViewModel
}