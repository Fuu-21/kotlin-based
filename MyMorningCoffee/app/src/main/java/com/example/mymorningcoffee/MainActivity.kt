package com.example.mymorningcoffee

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.example.mymorningcoffee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myDrink : MyCoffee = MyCoffee("Cappucino")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        binding.myCoffee = myDrink

      //  findViewById<Button>(R.id.bhayo_button).setOnClickListener {
        //    chainchaKiNai(it)
        //}

        binding.bhayoButton.setOnClickListener {
            chainchaKiNai(it)
        }
    }
    private fun chainchaKiNai(view: View)
    {
       // val editText = findViewById<EditText>(R.id.question_sodne_thau)
        // val aakoAnswer = findViewById<TextView>(R.id.answer)
        binding.apply {
          //  answer.text = binding.questionSodneThau.text
            myDrink?.drinkType = answer.text.toString()
            invalidateAll()
            answer.visibility = View.GONE
            bhayoButton.visibility = View.GONE
            questionSodneThau.visibility = View.VISIBLE
        }


        val kig = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        kig.hideSoftInputFromWindow(view.windowToken, 0)
    }

}