@file:SuppressLint("ComposableNaming")

package com.module.jetpack.compose.timetable.impl

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.module.jetpack.compose.common.Destinations
import com.module.jetpack.compose.common.di.injectedViewModel
import com.module.jetpack.compose.common.find
import com.module.jetpack.compose.data.api.LocalDataProvider
import com.module.jetpack.compose.detail.api.DetailEntry
import com.module.jetpack.compose.timetable.api.TimetableEntry
import com.module.jetpack.compose.timetable.impl.di.DaggerTimetableComponent
import com.module.jetpack.compose.timetable.impl.ui.TimetableScreen
import javax.inject.Inject

class TimetableEntryImpl @Inject constructor() : TimetableEntry() {

    @Composable
    override fun NavGraphBuilder.Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        val viewModel = injectedViewModel {
            DaggerTimetableComponent.builder()
                .dataProvider(LocalDataProvider.current)
                .build()
                .viewModel
        }

        TimetableScreen(viewModel, onUserSelected = {
            val detail = destinations.find<DetailEntry>().startDestinationInParent(startDestination())
            navController.navigate(detail)
        })
    }
}