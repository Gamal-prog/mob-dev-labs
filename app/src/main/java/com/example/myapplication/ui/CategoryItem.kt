package com.example.myapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import coil.compose.rememberAsyncImagePainter
import com.example.myapplication.network.Category
import androidx.compose.material3.Text

@Composable
fun CategoryItem(category: Category) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Изображение категории
        Image(
            painter = rememberAsyncImagePainter(category.thumbnail),
            contentDescription = "${category.name} Thumbnail",
            modifier = Modifier
                .size(100.dp) // Указываем размер изображения
                .padding(bottom = 8.dp)
        )

        // Название категории
        Text(
            text = category.name,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                color = Color.Black
            ),
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}



//2 COLUMNS
//package com.example.myapplication.ui
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.Alignment
//import coil.compose.rememberAsyncImagePainter
//import com.example.myapplication.network.Category
//import androidx.compose.material3.Text
//
//@Composable
//fun CategoryItem(
//    category: Category,
//    navigateToDetail: (Category) -> Unit
//) {
//    Column(
//        modifier = Modifier
//            .padding(8.dp)
//            .clickable { navigateToDetail(category) },
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Image(
//            painter = rememberAsyncImagePainter(category.thumbnail),
//            contentDescription = "${category.name} Thumbnail",
//            modifier = Modifier
//                .size(120.dp)
//                .padding(bottom = 8.dp)
//        )
//
//        Text(
//            text = category.name,
//            style = TextStyle(
//                fontWeight = FontWeight.Bold,
//                color = Color.Black
//            ),
//            modifier = Modifier.padding(top = 4.dp)
//        )
//    }
//}
