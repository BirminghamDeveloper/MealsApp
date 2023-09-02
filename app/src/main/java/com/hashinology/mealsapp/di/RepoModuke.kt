package com.hashinology.mealsapp.di

import com.hashinology.data.remote.ApiService
import com.hashinology.data.repo.MealsRepoImplementation
import com.hashinology.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object RepoModuke {
    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo{
        return MealsRepoImplementation(apiService)
    }
}