package com.example.modul4_lesson4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        val b_detail = findViewById<Button>(R.id.button1)
        b_detail.setOnClickListener { openDetailActivity() }
    }
    fun openDetailActivity(){
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("name","Yahya Mahmudiy")
        intent.putExtra("age",18)
        startActivity(intent)
    }
}