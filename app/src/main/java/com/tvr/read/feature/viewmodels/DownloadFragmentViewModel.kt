package com.tvr.read.feature.viewmodels

import androidx.lifecycle.ViewModel
import com.tvr.read.common.ItemClickListener
import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.adapters.AllBookAdapter
import com.tvr.read.feature.models.data_source.Book
import com.tvr.read.feature.models.writer_model.CategoryModelImp
import com.tvr.read.feature.models.writer_model.DownloadModelImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DownloadFragmentViewModel @Inject constructor(
    private var downloadModel: DownloadModelImp
): ViewModel(), ItemClickListener {
    val allBookAdapter: AllBookAdapter = AllBookAdapter(emptyList(), this)

    fun getPopularBooks(){
        downloadModel.getDownloadedBookList(object :
            RequestCompleteListener<List<Book>> {
            override fun onRequestSuccess(data: List<Book>) {
                //bookListLiveData.postValue(data)
                allBookAdapter.updateBooks(data)
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