package com.example.latihan3_antara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNilaiA = findViewById<EditText>(R.id.etNilaiA)
        val etNilaiB = findViewById<EditText>(R.id.etNilaiB)
        val btnJumlahkan = findViewById<Button>(R.id.btnJumlahkan)
        val hasil = findViewById<TextView>(R.id.ethasil)

        btnJumlahkan.setOnClickListener {
            val nilaiA = etNilaiA.text.toString().toInt()
            val nilaiB = etNilaiB.text.toString().toInt()
            val TotalJumlah = nilaiA + nilaiB
            hasil.text = TotalJumlah.toString()
        }
    }
}