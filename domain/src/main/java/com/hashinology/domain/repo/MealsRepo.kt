package com.hashinology.domain.repo

import com.hashinology.domain.entity.CategoryResponse

interface MealsRepo {
    suspend fun geMealsFromRemote(): CategoryResponse
}