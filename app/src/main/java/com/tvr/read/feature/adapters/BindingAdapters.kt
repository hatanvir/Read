package com.tvr.read.feature.adapters

import android.graphics.BitmapFactory
import android.graphics.Typeface
import android.util.Base64
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.signature.ObjectKey
import com.tvr.read.R
import com.tvr.read.common.BaseViewHolder


@BindingAdapter("isRead")
fun isRead(textView: TextView, isRead: Boolean) {
    textView.typeface = if(isRead) Typeface.DEFAULT else Typeface.DEFAULT_BOLD
}

@BindingAdapter("gridAdapter")
fun setGridAdapter(recyclerView: RecyclerView, adapter: RecyclerView.Adapter<BaseViewHolder>) {
    recyclerView.adapter = adapter
}



@BindingAdapter("mutableEnabled")
fun setMutableEnabled(view: View, enable: Boolean) {
    view.isEnabled = enable
}

@BindingAdapter("imageResource")
fun setImageResource(view: ImageView, resource: Int) {
    view.setImageResource(resource)
}

@BindingAdapter("imageUrl")
fun setImageUrl(imgView: ImageView, url:String?){

    if(!url.isNullOrEmpty()) {
        if(isBase64Image(url)){
            val decodedString: ByteArray = Base64.decode(url.split(",")[1], Base64.DEFAULT)
            val decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.size)
            imgView.setImageBitmap(decodedByte)
        }else{
            //try {
                Glide.with(imgView.context)
                    .load(url)
                    .signature( ObjectKey(System.currentTimeMillis()))
                    .centerInside()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .placeholder(R.drawable.dummy_book)
                    .into(imgView)
            //}catch (e:Exception){e.printStackTrace()}
        }
    }


}

@BindingAdapter("listAdapter")
fun setListAdapter(recyclerView: RecyclerView, adapter: RecyclerView.Adapter<BaseViewHolder>) {
    recyclerView.adapter = adapter
}


/**
 * checking image is base64 or not
 */
private fun isBase64Image(picture: String?): Boolean {
    return try {
        picture!!.split(":")[0]=="data"
    }catch (e:Exception){
        false
    }
}