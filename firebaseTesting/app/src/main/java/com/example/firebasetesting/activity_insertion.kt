package com.example.firebasetesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class activity_insertion : AppCompatActivity() {

    private lateinit var etEmpName: EditText
    private lateinit var etEmpAge: EditText
    private lateinit var etEmpSalary: EditText
    private lateinit var btnSaveData: EditText

    private lateinit var dbRef: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertion)

        etEmpName = findViewById(R.id.etEmpName)
        etEmpAge = findViewById(R.id.etEmpAge)
        etEmpSalary = findViewById(R.id.etEmpSalary)
        btnSaveData = findViewById(R.id.btnSave)

        dbRef = FirebaseDatabase.getInstance().getReference("Employees")

        btnSaveData.setOnClickListener{
            saveEmployeeData()
        }
    }

    private fun saveEmployeeData(){
        //getting values
        val empName = etEmpName.text.toString()
        val empAge =etEmpAge.text.toString()
        val empSalary = etEmpSalary.text.toString()

        if (empName.isEmpty()) {

            etEmpName.error = "Please enter the name"
        }
        if (empAge.isEmpty()) {
            etEmpAge.error = "Please enter the name"
        }
        if (empSalary.isEmpty()){

            etEmpSalary.error = "Please enter the name"
        }

        val empId = dbRef.push().key!!
    }
}