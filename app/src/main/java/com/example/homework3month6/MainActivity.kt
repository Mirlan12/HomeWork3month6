package com.example.homework3month6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework3month6.ViewPagerAdapter
import com.example.homework3month6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ViewPagerAdapter(this)
        binding.viewPager2.adapter = adapter
    }
}
