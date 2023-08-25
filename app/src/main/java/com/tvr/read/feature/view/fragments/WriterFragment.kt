package com.tvr.read.feature.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.tvr.read.R
import com.tvr.read.databinding.FragmentBookBinding
import com.tvr.read.databinding.FragmentWriterBinding
import com.tvr.read.feature.viewmodels.BookFragmentViewModel
import com.tvr.read.feature.viewmodels.WriterFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WriterFragment : Fragment() {
    companion object{
        val TAG = "WriterFragment";
    }
    private lateinit var binding: FragmentWriterBinding
    lateinit var writerFragmentViewModel: WriterFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentWriterBinding.inflate(layoutInflater)
        writerFragmentViewModel = ViewModelProvider(this)[WriterFragmentViewModel::class.java]
        writerFragmentViewModel.getWriters()
        binding.viewModel = writerFragmentViewModel
        return binding.root;
    }

}