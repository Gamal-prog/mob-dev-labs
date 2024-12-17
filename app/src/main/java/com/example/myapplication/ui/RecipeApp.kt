package com.example.myapplication.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.network.Category


@Composable
fun RecipeApp(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.RecipeScreen.route) {
        composable(Screen.RecipeScreen.route) {
            RecipeScreen(navController = navController)
        }
        composable(Screen.DetailScreen.route) {
            val category = navController.previousBackStackEntry
                ?.savedStateHandle
                ?.get<Category>("category") ?: Category("", "", "", "")
            CategoryDetailScreen(category = category)
        }
    }
}
