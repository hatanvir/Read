package com.tvr.read.feature.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.tvr.read.R
import com.tvr.read.common.BaseViewHolder
import com.tvr.read.common.ItemClickListener
import com.tvr.read.databinding.ItemCategoryBinding
import com.tvr.read.feature.models.data_source.Category

class AllCategoryAdapter(private var writers: List<Category>, private val listener: ItemClickListener): RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return AllCategoryHolder(
            DataBindingUtil.
        inflate(LayoutInflater.from(parent.context), R.layout.item_category, parent, false))
    }

    override fun getItemCount(): Int = writers.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBindView(writers[position])
       // (holder as ItemBookBinding).itemBinding.listener = listener
    }

    fun updateCategories(items: List<Category>) {
        writers = items
        notifyDataSetChanged()
    }
}

class AllCategoryHolder(val itemBinding: ItemCategoryBinding): BaseViewHolder(itemBinding.root) {

    override fun onBindView(dataItem: Any) {
        itemBinding.category = dataItem as Category
    }
}