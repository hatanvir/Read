package com.tvr.read.di

import androidx.lifecycle.ViewModel
import com.tvr.read.feature.models.home_book_model.BookModel
import com.tvr.read.feature.models.home_book_model.BookModelImp
import com.tvr.read.feature.viewmodels.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class ModelModule {
    @Binds
    abstract fun bindHomeBookFragmentViewModel(model: BookModelImp): BookModel
}