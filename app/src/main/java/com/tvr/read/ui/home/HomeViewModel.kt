package com.tvr.read.ui.home

import androidx.lifecycle.ViewModel
import com.tvr.read.network.ApiInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private var apiInterface: ApiInterface
): ViewModel() {
}