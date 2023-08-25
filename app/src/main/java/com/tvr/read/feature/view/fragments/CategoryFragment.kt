package com.tvr.read.feature.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.tvr.read.R
import com.tvr.read.databinding.FragmentBookBinding
import com.tvr.read.databinding.FragmentCategoryBinding
import com.tvr.read.feature.viewmodels.CategoryFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryFragment : Fragment() {
    companion object{
        val TAG = "CategoryFragment";
    }
    lateinit var binding: FragmentCategoryBinding
    lateinit var  categoryFragmentViewModel:CategoryFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCategoryBinding.inflate(layoutInflater)
        categoryFragmentViewModel = ViewModelProvider(this)[CategoryFragmentViewModel::class.java]

        categoryFragmentViewModel.getCategories();

        binding.viewModel = categoryFragmentViewModel
        return binding.root
    }

}