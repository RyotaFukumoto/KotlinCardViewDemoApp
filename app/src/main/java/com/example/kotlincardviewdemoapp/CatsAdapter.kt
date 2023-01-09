package com.example.kotlincardviewdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CatsAdapter(private val catsList: ArrayList<Cat>): RecyclerView.Adapter<CatsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView
        val name: TextView
        val berthDay: TextView

        init {
            image = view.findViewById(R.id.image)
            name = view.findViewById(R.id.name)
            berthDay = view.findViewById(R.id.berthDay)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_item, viewGroup, false)
        return ViewHolder(view)
    }


    override fun getItemCount() = catsList.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cat = catsList[position]

        holder.image.setImageResource(cat.imageId)
        holder.name.text = cat.name
        holder.berthDay.text = cat.berthDay
    }
}