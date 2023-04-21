package com.todolist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.todolist.DetailsActivity.Companion.TITLE_FOR_DETAILS
import com.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var fab: FloatingActionButton? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        fab = findViewById(R.id.fab)
        fab?.setOnClickListener {
            val intent = Intent(this@MainActivity, DetailsActivity::class.java)
            intent.putExtra(TITLE_FOR_DETAILS, getString(R.string.title_for_details))
            startActivity(intent)
        }
    }
}

