package com.tvr.read.feature.models.writer_model

import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.models.data_source.Book
import com.tvr.read.feature.models.data_source.Writer
import com.tvr.read.network.ApiInterface
import javax.inject.Inject

 class WriterModelImp @Inject constructor(
    private var apiInterface: ApiInterface
): WriterModel {
     override fun getWriterList(callback: RequestCompleteListener<List<Writer>>) {
         val list = mutableListOf<Writer>(
             Writer(1,"Test","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Writer(1,"Test","https://gobookmart.com/wp-content/uploads/2022/01/1-7.jpg"),
             Writer(1,"Test","https://1.bp.blogspot.com/-sE_Ht0htaI0/VBx00cVv1zI/AAAAAAAAGGM/-gHm45KtUYo/s1600/Humayun%2BAhmed.jpg"),
             Writer(1,"Test","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Writer(1,"Test","https://4.bp.blogspot.com/-URMXBeaxzE4/ViTcGTN2MWI/AAAAAAAABGM/BtSyRlFMdBU/s1600/Narayan%2BGangopadhyay.jpeg"),
             Writer(1,"Test","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Writer(1,"Test","https://gobookmart.com/wp-content/uploads/2022/01/1-7.jpg"),
             Writer(1,"Test","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Writer(1,"Test","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Writer(1,"Test","https://1.bp.blogspot.com/-sE_Ht0htaI0/VBx00cVv1zI/AAAAAAAAGGM/-gHm45KtUYo/s1600/Humayun%2BAhmed.jpg"),
             Writer(1,"Test","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Writer(1,"Test","https://gobookmart.com/wp-content/uploads/2022/01/1-7.jpg"),
             Writer(1,"Test","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Writer(1,"Test","https://1.bp.blogspot.com/-sE_Ht0htaI0/VBx00cVv1zI/AAAAAAAAGGM/-gHm45KtUYo/s1600/Humayun%2BAhmed.jpg"),
             Writer(1,"Test","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Writer(1,"Test","https://gobookmart.com/wp-content/uploads/2022/01/1-7.jpg"),
             Writer(1,"Test","https://m.media-amazon.com/images/I/510ZL9jtSjL._SY346_.jpg"),
             Writer(1,"Test","https://gobookmart.com/wp-content/uploads/2022/01/1-7.jpg"),

         )
         callback.onRequestSuccess(list)
     }

 }