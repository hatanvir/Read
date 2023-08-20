package com.tvr.read.feature.models.home_book_model

import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.models.data_source.Book
import com.tvr.read.network.ApiInterface
import javax.inject.Inject

 class BookModelImp @Inject constructor(
    private var apiInterface: ApiInterface
): BookModel {
     override fun getPopularBookList(callback: RequestCompleteListener<List<Book>>) {
         val list = mutableListOf<Book>(Book(1,"Test","Test","",1,"https://images.othoba.com/images/thumbs/0324901_-.jpeg"))
         callback.onRequestSuccess(list)
     }
 }