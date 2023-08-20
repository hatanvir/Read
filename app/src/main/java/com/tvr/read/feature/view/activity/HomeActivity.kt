package com.tvr.read.feature.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tvr.read.R
import com.tvr.read.databinding.ActivityHomeBinding
import com.tvr.read.feature.view.fragments.BookFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupFragment(BookFragment(), BookFragment.TAG);

        setupView()
    }

    private fun setupView() {
        //binding.bottomNavigationView
    }

    private fun setupFragment(fragment: BookFragment, tag:String) {
        val fragmentTr = this.supportFragmentManager.beginTransaction()
        fragmentTr.replace(R.id.fragmentContainer,fragment)
        fragmentTr.addToBackStack(tag)
        fragmentTr.commit()
    }
}