package com.tvr.read.feature.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.tvr.read.R
import com.tvr.read.common.BaseViewHolder
import com.tvr.read.common.ItemClickListener
import com.tvr.read.databinding.ItemPopularBinding
import com.tvr.read.feature.models.data_source.Book

class PopularBookAdapter(private var members: List<Book>, private val listener: ItemClickListener): RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return MemberHolder(
            DataBindingUtil.
        inflate(LayoutInflater.from(parent.context), R.layout.item_popular, parent, false))
    }

    override fun getItemCount(): Int = members.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBindView(members[position])
        (holder as MemberHolder).itemBinding.listener = listener
    }

    fun updateBooks(items: List<Book>) {
        members = items
        notifyDataSetChanged()
    }
}

class MemberHolder(val itemBinding: ItemPopularBinding): BaseViewHolder(itemBinding.root) {

    override fun onBindView(dataItem: Any) {
        itemBinding.book = dataItem as Book
    }
}