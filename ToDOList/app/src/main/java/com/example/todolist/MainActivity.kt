package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var todoAdapter: ToDoAdapter
    private lateinit var toDoTitleEditText: EditText
    private lateinit var addToDoButton: Button
    private lateinit var deleteDoneButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        todoAdapter = ToDoAdapter(mutableListOf())

        val toDoItems = findViewById<RecyclerView>(R.id.toDoItems)
        toDoItems.adapter = todoAdapter
        toDoItems.layoutManager = LinearLayoutManager(this)

        toDoTitleEditText = findViewById(R.id.toDoTitle)
        addToDoButton = findViewById(R.id.addToDo)
        deleteDoneButton = findViewById(R.id.deleteDone)

        addToDoButton.setOnClickListener {
            val todoTitle = toDoTitleEditText.text.toString()
            if (todoTitle.isNotEmpty()) {
                val newTodo = ToDo(todoTitle, false)
                todoAdapter.addTodo(newTodo)
                toDoTitleEditText.text.clear()
            }
        }

        deleteDoneButton.setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }
    }
}
