package com.tvr.read.feature.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.tvr.read.R
import com.tvr.read.databinding.ActivityHomeBinding
import com.tvr.read.databinding.FragmentBookBinding
import com.tvr.read.feature.viewmodels.BookFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BookFragment : Fragment() {
    companion object{
        val TAG = "BookFragment";
    }

    private lateinit var binding: FragmentBookBinding
    private val bookFragmentViewModel:BookFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookBinding.inflate(layoutInflater)

        binding.viewModel = bookFragmentViewModel
        return binding.root
    }
}