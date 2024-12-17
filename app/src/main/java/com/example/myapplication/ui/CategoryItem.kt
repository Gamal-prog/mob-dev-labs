//package com.example.myapplication.ui
//
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.Image
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.graphics.Color
//import coil.compose.rememberAsyncImagePainter
//import androidx.compose.material3.Text
//import com.example.myapplication.network.Category
//
//
//@Composable
//fun CategoryItem(category: Category) {
//    Column(
//        modifier = Modifier
//            .padding(8.dp)
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Image(
//            painter = rememberAsyncImagePainter(category.thumbnail),
//            contentDescription = null,
//            modifier = Modifier
//                .fillMaxSize()
//                .aspectRatio(1f)
//        )
//        Text(
//            text = category.name,
//            color = Color.Black,
//            style = TextStyle(fontWeight = FontWeight.Bold),
//            modifier = Modifier.padding(top = 4.dp)
//        )
//    }
//}


//package com.example.myapplication.ui
//
//import androidx.compose.foundation.Image
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
//fun CategoryItem(category: Category) {
//    Column(
//        modifier = Modifier
//            .padding(8.dp)
//            .fillMaxWidth(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        // Изображение категории
//        Image(
//            painter = rememberAsyncImagePainter(category.thumbnail),
//            contentDescription = "${category.name} Thumbnail",
//            modifier = Modifier
//                .size(100.dp) // Указываем размер изображения
//                .padding(bottom = 8.dp)
//        )
//
//        // Название категории
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


package com.example.myapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
fun CategoryItem(
    category: Category,
    navigateToDetail: (Category) -> Unit
) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .clickable { navigateToDetail(category) },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Изображение категории
        Image(
            painter = rememberAsyncImagePainter(category.thumbnail),
            contentDescription = "${category.name} Thumbnail",
            modifier = Modifier
                .size(120.dp) // Указываем размер изображения для сетки
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
