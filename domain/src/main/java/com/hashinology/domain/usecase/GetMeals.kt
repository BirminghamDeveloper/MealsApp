package com.hashinology.domain.usecase

import com.hashinology.domain.repo.MealsRepo

class GetMeals(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke() = mealsRepo.geMealsFromRemote()
}