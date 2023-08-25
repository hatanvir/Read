package com.tvr.read.feature.viewmodels

import androidx.lifecycle.ViewModel
import com.tvr.read.common.ItemClickListener
import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.adapters.AllBookAdapter
import com.tvr.read.feature.adapters.AllCategoryAdapter
import com.tvr.read.feature.models.data_source.Book
import com.tvr.read.feature.models.data_source.Category
import com.tvr.read.feature.models.writer_model.CategoryModelImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CategoryFragmentViewModel @Inject constructor(
    private var categoryModel: CategoryModelImp
): ViewModel(), ItemClickListener {
    val allCategoryAdapter: AllCategoryAdapter = AllCategoryAdapter(emptyList(), this)

    fun getCategories(){
        categoryModel.getCategoryList(object :
            RequestCompleteListener<List<Category>> {
            override fun onRequestSuccess(data: List<Category>) {
                //bookListLiveData.postValue(data)
                allCategoryAdapter.updateCategories(data)
            }

            override fun onRequestFailed(errorMessage: String) {
                //error.postValue(errorMessage)
            }
        })
    }

    override fun onItemClicked(dataItem: Any) {
        TODO("Not yet implemented")
    }
}