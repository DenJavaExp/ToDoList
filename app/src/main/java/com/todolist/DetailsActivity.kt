package com.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val text = intent?.getStringExtra("text")
        val editText = findViewById<EditText>(R.id.edit_text_title)// приведение к типу в <> указал тип который искать в активити
        editText.hint = text
    }
}