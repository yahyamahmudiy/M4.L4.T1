package com.example.modul4_lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    var TAG = MainActivity2::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initView()
    }

    fun initView(){
        val detail = findViewById<TextView>(R.id.detail1)
        val detail1 = findViewById<TextView>(R.id.detail2)
        val name = intent.getStringExtra("name")
        val age = intent.getIntExtra("age",18)
        Log.d(TAG,name!!)
        Log.d(TAG, age.toString())

        detail.text = name
        detail1.text = age.toString()

    }
}