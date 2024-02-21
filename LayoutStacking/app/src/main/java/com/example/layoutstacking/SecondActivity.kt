package com.example.layoutstacking

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity as AppCompatActivity1

class SecondActivity : AppCompatActivity1() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener(){
            finish()
        }
    }
}