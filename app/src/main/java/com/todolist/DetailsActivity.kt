package com.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val text = intent?.getStringExtra(TITLE_FOR_DETAILS)
        val textField = findViewById<TextInputLayout>(R.id.textField)
        textField.hint = text


    }

    companion object{
        const val TITLE_FOR_DETAILS = "titleForDetails"
    }

}