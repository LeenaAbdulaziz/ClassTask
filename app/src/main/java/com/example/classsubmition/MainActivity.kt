package com.example.classsubmition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var nameText: EditText
    lateinit var locationText: EditText
    lateinit var phoneText: EditText
    lateinit var tvmain: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1= findViewById<Button>(R.id.buttona)
        button2= findViewById<Button>(R.id.buttonTv)
        button3= findViewById<Button>(R.id.buttonGo)
        nameText=findViewById<EditText>(R.id.editText1)
        locationText=findViewById<EditText>(R.id.editText2)
        phoneText=findViewById<EditText>(R.id.editText3)
        tvmain =findViewById<TextView>(R.id.textView2)
        button1.setOnClickListener(){
            val list=listOf(nameText.text,locationText.text,phoneText.text)

            Toast.makeText(applicationContext,"this is toast message",Toast.LENGTH_SHORT).show()

        }
        button2.setOnClickListener {
            val list=listOf(nameText.text,locationText.text,phoneText.text)

            tvmain.text = list.shuffled().take(1).toString()
        }

        button3.setOnClickListener {
            val name=nameText.text.toString()
            val location=locationText.text.toString()
            val phone=phoneText.text.toString()
            val intent = Intent(this, MyActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("Location",location)
            intent.putExtra("phone",phone)
            startActivity(intent)
            }
        }

    }
