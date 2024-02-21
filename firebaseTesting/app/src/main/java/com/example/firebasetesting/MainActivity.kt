package com.example.firebasetesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var btnInsertdata: Button
    private lateinit var btnFetchData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firebase : DatabaseReference = FirebaseDatabase.getInstance().getReference()

        btnInsertdata = findViewById(R.id.btnInsertData)
        btnFetchData = findViewById(R.id.btnFetchData)


        btnInsertdata.setOnClickListener{
            val intent = Intent(this, activity_insertion::class.java)
            startActivity(intent)
        }
        btnFetchData.setOnClickListener {
            val intent = Intent(this, fetching_activity::class.java)
            startActivity(intent)
        }
    }
}