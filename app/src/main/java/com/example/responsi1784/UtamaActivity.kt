package com.example.responsi1784

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UtamaActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter : RecyclerView.Adapter<produk_adapter.ViewHolder>?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utama)

        layoutManager = LinearLayoutManager(this)

        var rvproduct : RecyclerView = findViewById(R.id.list_destinasi)

        rvproduct.layoutManager = layoutManager

        adapter = produk_adapter()
        rvproduct.adapter = adapter
    }
}