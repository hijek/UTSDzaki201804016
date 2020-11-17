package com.Dzaki.UTS201804016

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMouse(private val ListMouse: ArrayList<Mouse>) : RecyclerView.Adapter<ListMouse.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvMouse: TextView = itemView.findViewById(R.id.tv_mouse)
        var tvHargaM: TextView = itemView.findViewById(R.id.tv_hargam)
        var ivLogoM: ImageView = itemView.findViewById(R.id.civ_mouse)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_mouse, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ListMouse.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val mouse = ListMouse[position]

        Glide.with(holder.itemView.context)
            .load(mouse.logoM)
            .apply(RequestOptions().override(50, 50))
            .into(holder.ivLogoM)
        holder.tvMouse.text = mouse.produkM
        holder.tvHargaM.text = mouse.hargaM
    }
}