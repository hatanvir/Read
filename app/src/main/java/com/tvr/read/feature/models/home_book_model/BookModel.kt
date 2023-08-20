package com.tvr.read.feature.models.home_book_model

import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.models.data_source.Book

interface BookModel {
    fun getPopularBookList(callback: RequestCompleteListener<List<Book>>)
}