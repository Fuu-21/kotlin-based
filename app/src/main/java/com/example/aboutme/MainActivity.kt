package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set click listener for the button using setOnClickListener
        findViewById<Button>(R.id.button).setOnClickListener {
            addNickName(it)
        }
    }

    // Function to handle the addition of a nickname
    private fun addNickName(view: View) {
        // Find the EditText and TextView by their IDs
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nickNameTextView = findViewById<TextView>(R.id.nickname_text)

        // Set the text of the TextView to the input from the EditText
        nickNameTextView.text = editText.text

        // Hide the EditText and the button, and show the TextView
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nickNameTextView.visibility = View.VISIBLE

        // Hide the soft keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
