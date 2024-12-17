package com.example.myapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.myapplication.network.Category

@Composable
fun CategoryDetailScreen(category: Category) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Заголовок категории
        Text(
            text = "Category Name: ${category.name}",
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Изображение категории
        Image(
            painter = rememberAsyncImagePainter(category.thumbnail),
            contentDescription = "Category Image",
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 8.dp)
        )

        // Описание категории
        Text(
            text = "Description: ${category.description}",
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}



//package com.example.myapplication.ui
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import coil.compose.rememberAsyncImagePainter
//import com.example.myapplication.network.Category
//
//
//@Composable
//fun CategoryDetailScreen(category: Category) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = category.strCategory, textAlign = TextAlign.Center)
//
//        Image(
//            painter = rememberAsyncImagePainter(category.strCategoryThumb),
//            contentDescription = "${category.strCategory} Thumbnail",
//            modifier = Modifier
//                .wrapContentSize()
//                .aspectRatio(1f)
//        )
//
//        Text(
//            text = category.strCategoryDescription,
//            textAlign = TextAlign.Justify,
//            modifier = Modifier.verticalScroll(rememberScrollState())
//        )
//    }
//}
