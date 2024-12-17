package com.example.myapplication.ui

sealed class Screen(val route: String) {
    object RecipeScreen : Screen("recipescreen")
    object DetailScreen : Screen("detailscreen")
}
