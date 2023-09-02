package com.hashinology.data.remote

import com.hashinology.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php/")
    suspend fun getMeals(): CategoryResponse
}