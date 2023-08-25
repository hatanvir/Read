package com.tvr.read.feature.viewmodels

import androidx.lifecycle.ViewModel
import com.tvr.read.feature.models.home_book_model.BookModel
import com.tvr.read.network.ApiInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private var bookModel: BookModel
): ViewModel() {
    lateinit var toolbarTitle: String
}