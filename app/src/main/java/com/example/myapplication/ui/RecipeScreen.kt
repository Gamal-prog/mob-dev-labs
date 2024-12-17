//package com.example.myapplication.ui
//
//import androidx.compose.foundation.layout.Box
//import androidx.compose.material3.CircularProgressIndicator
//import androidx.compose.material3.Text
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.lifecycle.viewmodel.compose.viewModel
//import com.example.myapplication.viewmodel.MainViewModel
//import androidx.compose.foundation.layout.fillMaxSize
//
//@Composable
//fun RecipeScreen(modifier: Modifier = Modifier) {
//    val recipeViewModel: MainViewModel = viewModel()
//    val viewState by recipeViewModel.categoriesState
//
//    Box(modifier = Modifier.fillMaxSize()) {
//        when {
//            viewState.loading -> {
//                //CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
//                Text(text = "Loading!")
//            }
//            viewState.error != null -> {
//                Text("ERROR OCCURRED", modifier = Modifier.align(Alignment.Center))
//            }
//            else -> {
//                CategoryScreen(categories = viewState.list)
//            }
//        }
//    }
//}

package com.example.myapplication.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.layout.fillMaxSize
import androidx.navigation.NavController
import com.example.myapplication.viewmodel.MainViewModel

@Composable
fun RecipeScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoriesState

    Box(modifier = Modifier.fillMaxSize()) {
        when {
            viewState.loading -> {
                Text(text = "Loading!", modifier = Modifier.align(Alignment.Center))
            }
            viewState.error != null -> {
                Text("ERROR OCCURRED", modifier = Modifier.align(Alignment.Center))
            }
            else -> {
                CategoryScreen(
                    categories = viewState.list,
                    navigateToDetail = { category ->
                        // Сохраняем категорию и переходим на экран деталей
                        navController.currentBackStackEntry
                            ?.savedStateHandle
                            ?.set("category", category)
                        navController.navigate(Screen.DetailScreen.route)
                    }
                )
            }
        }
    }
}

