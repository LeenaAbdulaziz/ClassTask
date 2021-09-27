package com.example.classsubmition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
//        val textView=findViewById<TextView>(R.id.textV)
        val textView=findViewById<TextView>(R.id.textView22)
        val name=intent.getStringExtra("name")
        val location=intent.getStringExtra("location")
        val phone=intent.getStringExtra("phone")
        textView.setText(" $name | $location  | $phone ")
    }
}