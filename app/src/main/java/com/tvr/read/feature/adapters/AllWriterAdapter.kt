package com.tvr.read.feature.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.tvr.read.R
import com.tvr.read.common.BaseViewHolder
import com.tvr.read.common.ItemClickListener
import com.tvr.read.databinding.ItemBookBinding
import com.tvr.read.databinding.ItemPopularBinding
import com.tvr.read.databinding.ItemWriterBinding
import com.tvr.read.feature.models.data_source.Writer

class AllWriterAdapter(private var writers: List<Writer>, private val listener: ItemClickListener): RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return AllWriterHolder(
            DataBindingUtil.
        inflate(LayoutInflater.from(parent.context), R.layout.item_writer, parent, false))
    }

    override fun getItemCount(): Int = writers.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBindView(writers[position])
       // (holder as ItemBookBinding).itemBinding.listener = listener
    }

    fun updateWriters(items: List<Writer>) {
        writers = items
        notifyDataSetChanged()
    }
}

class AllWriterHolder(val itemBinding: ItemWriterBinding): BaseViewHolder(itemBinding.root) {

    override fun onBindView(dataItem: Any) {
        itemBinding.writer = dataItem as Writer
    }
}