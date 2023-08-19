package com.tvr.read.di

import androidx.lifecycle.ViewModel
import com.tvr.read.ui.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindHomeFragmentViewModel(viewModel: HomeViewModel): ViewModel
}