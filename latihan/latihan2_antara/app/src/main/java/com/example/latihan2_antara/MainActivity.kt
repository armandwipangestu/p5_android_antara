package com.example.latihan2_antara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_main)

        val etName = findViewById<TextView>(R.id.etName)
        val btnSayHello = findViewById<Button>(R.id.btnSayHello)
        val etWelcome = findViewById<TextView>(R.id.etWelcome)

        btnSayHello.setOnClickListener {
            val name = etName.text.toString()
            etWelcome.setText("Welcome $name")
        }
    }
}