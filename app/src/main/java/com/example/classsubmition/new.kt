package com.example.classsubmition


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class printOut : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_print_out)

        val tvMain = findViewById<TextView>(R.id.textV)

        val extra = intent.extras?.get("value")

        tvMain.text = extra.toString()
    }
}

