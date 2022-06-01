package com.module.jetpack.compose.timetable.impl.di

import com.module.jetpack.compose.common.FeatureEntry
import com.module.jetpack.compose.common.di.FeatureEntryKey
import com.module.jetpack.compose.timetable.api.TimetableEntry
import com.module.jetpack.compose.timetable.impl.TimetableEntryImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface TimetableEntryModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(TimetableEntry::class)
    fun profileEntry(entry: TimetableEntryImpl): FeatureEntry
}