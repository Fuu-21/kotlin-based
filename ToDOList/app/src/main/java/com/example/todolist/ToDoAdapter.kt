package com.example.todolist

import android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter (
    private val todos: MutableList<ToDo>
): RecyclerView.Adapter<ToDoAdapter.TodoViewHolder>(){
    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo,
                parent,
                false
            )
        )
    }

    fun addTodo(todo: ToDo){
        todos.add(todo)
        notifyItemInserted(todos.size - 1)
    }

    fun deleteDoneTodos(){
        todos.removeAll { todo ->
            todo.isChecked
        }
        notifyDataSetChanged()
    }

    private fun toggleStrikeThrough(toDoTitle: TextView, isChecked: Boolean){
        if(isChecked){
            toDoTitle.paintFlags = toDoTitle.paintFlags or STRIKE_THRU_TEXT_FLAG
        }else{
            toDoTitle.paintFlags = toDoTitle.paintFlags and STRIKE_THRU_TEXT_FLAG.inv()
        }
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val curTodo = todos[position]
        holder.itemView.apply {
            val toDoTitle: TextView = findViewById(R.id.toDoTitle)
            val Done: CheckBox = findViewById(R.id.Done)

            toDoTitle.text = curTodo.title
            Done.isChecked = curTodo.isChecked
            toggleStrikeThrough(toDoTitle, curTodo.isChecked)

            Done.setOnCheckedChangeListener { _, isChecked ->
                toggleStrikeThrough(toDoTitle, isChecked)
                curTodo.isChecked = isChecked
            }
        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}
