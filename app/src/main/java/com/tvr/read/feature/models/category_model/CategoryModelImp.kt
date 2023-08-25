package com.tvr.read.feature.models.writer_model

import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.models.data_source.Book
import com.tvr.read.feature.models.data_source.Category
import com.tvr.read.network.ApiInterface
import javax.inject.Inject

 class CategoryModelImp @Inject constructor(
    private var apiInterface: ApiInterface
): CategoryModel {
     override fun getCategoryList(callback: RequestCompleteListener<List<Category>>) {
         val list = mutableListOf<Category>(
             Category(1,"Novel","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Category(1,"Science","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Category(1,"Poem","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Category(1,"Science","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Category(1,"Novel","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Category(1,"Poem","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Category(1,"Test","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Category(1,"Novel","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Category(1,"Poem","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Category(1,"Science","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
         )
         callback.onRequestSuccess(list)
     }

 }