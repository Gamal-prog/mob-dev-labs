package com.example.myapplication.network

import retrofit2.http.GET
import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}

data class CategoriesResponse(
    @SerializedName("categories") val categories: List<Category>
)

//data class Category(
//    @SerializedName("idCategory") val id: String,
//    @SerializedName("strCategory") val name: String,
//    @SerializedName("strCategoryThumb") val thumbnail: String,
//    @SerializedName("strCategoryDescription") val description: String
//)
@Parcelize
data class Category(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String,
    @SerializedName("strCategoryThumb") val thumbnail: String,
    @SerializedName("strCategoryDescription") val description: String
) : Parcelable
