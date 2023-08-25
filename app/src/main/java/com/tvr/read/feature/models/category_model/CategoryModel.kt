package com.tvr.read.feature.models.writer_model

import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.models.data_source.Book
import com.tvr.read.feature.models.data_source.Category
import com.tvr.read.feature.models.data_source.Writer

interface CategoryModel {
    fun getCategoryList(callback: RequestCompleteListener<List<Category>>)
}