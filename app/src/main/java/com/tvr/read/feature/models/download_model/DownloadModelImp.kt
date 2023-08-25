package com.tvr.read.feature.models.writer_model

import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.models.data_source.Book
import com.tvr.read.network.ApiInterface
import javax.inject.Inject

 class DownloadModelImp @Inject constructor(
    private var apiInterface: ApiInterface
): DownloadModel {
     override fun getDownloadedBookList(callback: RequestCompleteListener<List<Book>>) {
         val list = mutableListOf<Book>(
             Book(1,"Test","Test","",1,"https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Book(1,"Test","Test","",1,"https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Book(1,"Test","Test","",1,"https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Book(1,"Test","Test","",1,"https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Book(1,"Test","Test","",1,"https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Book(1,"Test","Test","",1,"https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Book(1,"Test","Test","",1,"https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Book(1,"Test","Test","",1,"https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Book(1,"Test","Test","",1,"https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Book(1,"Test","Test","",1,"https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
         )
         callback.onRequestSuccess(list)
     }

 }