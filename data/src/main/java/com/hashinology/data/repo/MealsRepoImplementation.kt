package com.hashinology.data.repo

import com.hashinology.data.remote.ApiService
import com.hashinology.domain.entity.CategoryResponse
import com.hashinology.domain.repo.MealsRepo

class MealsRepoImplementation(private val apiService: ApiService): MealsRepo {
    override suspend fun geMealsFromRemote(): CategoryResponse =
        apiService.getMeals()
}