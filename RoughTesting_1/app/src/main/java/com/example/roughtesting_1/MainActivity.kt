package com.example.firebasetesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.roughtesting_1.R
import com.example.roughtesting_1.fetching_activity
import com.example.roughtesting_1.insertion_activity


class MainActivity : AppCompatActivity() {

    private lateinit var btnInsertdata: Button
    private lateinit var btnFetchData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val firebase : DatabaseReference = FirebaseDatabase.getInstance().getReference()

        btnInsertdata = findViewById(R.id.btnInsertData)
        btnFetchData = findViewById(R.id.btnFetchData)


        btnInsertdata.setOnClickListener{
            val intent = Intent(this, insertion_activity::class.java)
            startActivity(intent)
        }
        btnFetchData.setOnClickListener {
            val intent = Intent(this, fetching_activity::class.java)
            startActivity(intent)
        }
    }
}