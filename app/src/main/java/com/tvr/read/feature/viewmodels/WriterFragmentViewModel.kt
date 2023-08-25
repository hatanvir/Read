package com.tvr.read.feature.viewmodels

import androidx.lifecycle.ViewModel
import com.tvr.read.common.ItemClickListener
import com.tvr.read.common.RequestCompleteListener
import com.tvr.read.feature.adapters.AllWriterAdapter
import com.tvr.read.feature.models.data_source.Writer
import com.tvr.read.feature.models.writer_model.WriterModelImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WriterFragmentViewModel @Inject constructor(
    private var writerModel: WriterModelImp
): ViewModel(), ItemClickListener{
    val allWriterAdapter: AllWriterAdapter = AllWriterAdapter(emptyList(), this)


    fun getWriters(){
        writerModel.getWriterList(object :
            RequestCompleteListener<List<Writer>> {
            override fun onRequestSuccess(data: List<Writer>) {
                allWriterAdapter.updateWriters(data);
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