package com.hashinology.mealsapp.di

import com.hashinology.domain.repo.MealsRepo
import com.hashinology.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(mealsRepo: MealsRepo): GetMeals{
        return GetMeals(mealsRepo)
    }
}