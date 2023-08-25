package com.tvr.read.di

import androidx.lifecycle.ViewModel
import com.tvr.read.feature.viewmodels.BookFragmentViewModel
import com.tvr.read.feature.viewmodels.DownloadFragmentViewModel
import com.tvr.read.feature.viewmodels.HomeViewModel
import com.tvr.read.feature.viewmodels.WriterFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class  ViewModelModule {

    @Binds
    abstract fun bindHomeFragmentViewModel(viewModel: HomeViewModel): ViewModel

    @Binds
    abstract fun bindBookFragmentViewModel(viewModel: BookFragmentViewModel): ViewModel

    @Binds
    abstract fun writerFragmentViewModel(viewModel: WriterFragmentViewModel): ViewModel

    @Binds
    abstract fun downloadFragmentViewModel(viewModel: DownloadFragmentViewModel): ViewModel
}