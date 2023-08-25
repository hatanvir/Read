package com.tvr.read.feature.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.tvr.read.R
import com.tvr.read.databinding.FragmentDownloadBinding
import com.tvr.read.feature.viewmodels.BookFragmentViewModel
import com.tvr.read.feature.viewmodels.DownloadFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DownloadFragment : Fragment() {
    companion object{
        val TAG = "DownloadFragment";
    }

    private lateinit var binding: FragmentDownloadBinding
    lateinit var downloadFragmentViewModel: DownloadFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDownloadBinding.inflate(layoutInflater)
        downloadFragmentViewModel = ViewModelProvider(this)[DownloadFragmentViewModel::class.java]
        downloadFragmentViewModel.getPopularBooks()
        binding.viewModel = downloadFragmentViewModel
        return binding.root
    }
}