package com.example.tugas1_antara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNilaiA = findViewById<TextView>(R.id.etNilai1)
        val etNilaiB = findViewById<TextView>(R.id.etNilai2)
        val btnPembagian = findViewById<Button>(R.id.btnPembagian)
        val hasil = findViewById<TextView>(R.id.etHasil)

        btnPembagian.setOnClickListener {
            val nilaiA = etNilaiA.text.toString().toInt()
            val nilaiB = etNilaiB.text.toString().toInt()
            val total = nilaiA / nilaiB
            hasil.text = total.toString()
        }
    }
}