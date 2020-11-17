package com.Dzaki.UTS201804016

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListKeyboard(private val listProduk: ArrayList<Keyboard>) : RecyclerView.Adapter<ListKeyboard.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvProduk: TextView = itemView.findViewById(R.id.tv_keyboard)
        var tvHarga: TextView = itemView.findViewById(R.id.tv_hargak)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_keyboard)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_keyboard, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listProduk.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val produk = listProduk[position]

        Glide.with(holder.itemView.context)
            .load(produk.logok)
            .apply(RequestOptions().override(50, 50))
            .into(holder.ivLogo)
        holder.tvProduk.text = produk.produkk
        holder.tvHarga.text = produk.hargak
    }
}