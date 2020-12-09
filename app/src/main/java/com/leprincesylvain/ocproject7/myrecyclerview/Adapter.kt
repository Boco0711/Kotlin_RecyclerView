package com.leprincesylvain.ocproject7.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class Adapter(private val list: List<ItemExample>) : RecyclerView.Adapter<Adapter.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ExampleViewHolder(itemView)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = list[position]

        holder.imageView.setImageResource(currentItem.imageRessource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2
    }

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.item_image_view
        val textView1: TextView = itemView.item_text_view_1
        val textView2: TextView = itemView.item_text_view_2
    }
}