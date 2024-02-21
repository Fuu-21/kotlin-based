package com.example.layoutstacking

import android.os.Bundle
import com.example.layoutstacking.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private var currentPage = 1
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Use binding.root instead of R.layout.activity_main

        binding.pageTextView.text = "Page $currentPage"

        binding.nextButton.setOnClickListener {
            if (currentPage == 2) {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            } else {
                currentPage++
                binding.pageTextView.text = "Page $currentPage"
            }
        }
    }
}
