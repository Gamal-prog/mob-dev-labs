package com.example.myapplication.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.network.Category
@Composable
fun CategoryScreen(
    categories: List<Category>,
    navigateToDetail: (Category) -> Unit
) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(categories) { category ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { navigateToDetail(category) }
                    .padding(16.dp)
            ) {
                CategoryItem(category = category)
            }
        }
    }
}



//2 COLUMNS
//package com.example.myapplication.ui
//
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import com.example.myapplication.network.Category
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.grid.GridCells
//import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
//import androidx.compose.foundation.lazy.grid.items
//
//@Composable
//fun CategoryScreen(
//    categories: List<Category>,
//    navigateToDetail: (Category) -> Unit
//) {
//    LazyVerticalGrid(
//        columns = GridCells.Fixed(2),
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(8.dp)
//    ) {
//        items(categories) { category ->
//            CategoryItem(
//                category = category,
//                navigateToDetail = navigateToDetail
//            )
//        }
//    }
//}
//
