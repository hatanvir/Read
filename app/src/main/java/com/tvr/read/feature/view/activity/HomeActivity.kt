package com.tvr.read.feature.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.navigation.NavigationBarView
import com.tvr.read.R
import com.tvr.read.databinding.ActivityHomeBinding
import com.tvr.read.feature.view.fragments.BookFragment
import com.tvr.read.feature.view.fragments.CategoryFragment
import com.tvr.read.feature.view.fragments.DownloadFragment
import com.tvr.read.feature.view.fragments.WriterFragment
import com.tvr.read.feature.viewmodels.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        binding.viewModel = homeViewModel

        homeViewModel.toolbarTitle = "Books"
        setupFragment(BookFragment(), BookFragment.TAG);

        setupView()
    }

    /**
     * bottom navigation interactgion
     */
    private fun setupView() {
        binding.bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item->
            when(item.itemId){
                R.id.books -> {
                    homeViewModel.toolbarTitle = "Books"
                    setupFragment(BookFragment(),BookFragment.TAG)
                    true
                }
                R.id.category -> {
                    homeViewModel.toolbarTitle = "Categories"
                    setupFragment(CategoryFragment(),CategoryFragment.TAG)
                    true
                }
                R.id.writer -> {
                    homeViewModel.toolbarTitle = "Writers"
                    setupFragment(WriterFragment(),WriterFragment.TAG)
                    true
                }
                R.id.downloaded_book -> {
                    homeViewModel.toolbarTitle = "Local Books"
                    setupFragment(DownloadFragment(),DownloadFragment.TAG)
                    true
                }
                else -> {
                    homeViewModel.toolbarTitle = "Settings"
                    setupFragment(WriterFragment(),WriterFragment.TAG)
                    true
                }
            }
        })
    }

    /**
     * fragment setup to container
     */
    private fun setupFragment(fragment: Fragment, tag:String) {
        val fragmentTr = this.supportFragmentManager.beginTransaction()
        fragmentTr.replace(R.id.fragmentContainer,fragment)
        fragmentTr.addToBackStack(tag)
        fragmentTr.commit()
    }
}