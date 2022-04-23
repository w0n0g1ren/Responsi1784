package com.example.responsi1784

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HalamanAwal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val tombol : Button = findViewById(R.id.starttour)

        tombol.setOnClickListener {
            val intent = Intent(this,UtamaActivity::class.java)
            startActivity((intent))
        }
    }
}