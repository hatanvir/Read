package com.tvr.read.feature.models.writer_model

import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.models.data_source.Book
import com.tvr.read.feature.models.data_source.Writer

interface DownloadModel {
    fun getDownloadedBookList(callback: RequestCompleteListener<List<Book>>)
}