package com.example.myapplication.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.network.Category
import androidx.compose.foundation.lazy.items



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
                Text(text = category.name)
            }
        }
    }
}

