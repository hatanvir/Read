package com.tvr.read.feature.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tvr.read.common.ItemClickListener
import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.adapters.PopularBookAdapter
import com.tvr.read.feature.models.data_source.Book
import com.tvr.read.feature.models.home_book_model.BookModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BookFragmentViewModel @Inject constructor(
    private val bookModel: BookModel
):ViewModel(),ItemClickListener {
    val bookListLiveData = MutableLiveData<MutableList<Book>>()

    val popularBookAdapter: PopularBookAdapter = PopularBookAdapter(emptyList(), this)

    fun getPopularBooks(){
        bookModel.getPopularBookList(object :
            RequestCompleteListener<List<Book>> {
            override fun onRequestSuccess(data: List<Book>) {
                //bookListLiveData.postValue(data)
                popularBookAdapter.updateBooks(data);
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