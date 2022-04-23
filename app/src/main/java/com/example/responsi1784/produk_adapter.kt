package com.example.responsi1784

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class produk_adapter : RecyclerView.Adapter<produk_adapter.ViewHolder>() {

    private var foto = intArrayOf(R.drawable.fe9724d8fb4da3dd4590353bd771a276,R.drawable.lake_281848937_1000,R.drawable.gununglawu)
    private var nama = arrayOf("Pantai Somalia","Danau Claket","Gunung Lawu")
    private var harga = arrayOf("Rp.4.500.000","Rp.10.000.000","Rp.2.000.000")
    inner class ViewHolder (itemView: View) :RecyclerView.ViewHolder(itemView) {

        var itemfoto : ImageView
        var itemnama : TextView
        var itemharga : TextView

        init {
            itemfoto = itemView.findViewById(R.id.fotodestinasi)
            itemharga = itemView.findViewById(R.id.hargadestinasi)
            itemnama = itemView.findViewById(R.id.namadestinasi)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview2,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemfoto.setImageResource(foto[position])
        holder.itemnama.text = nama[position]
        holder.itemharga.text = harga[position]
    }

    override fun getItemCount(): Int {
        return nama.size
    }
}