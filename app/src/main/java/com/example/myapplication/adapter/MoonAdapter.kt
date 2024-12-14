package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class MoonAdapter (
    val context: Context,
    val imageList1: ArrayList<Int>,

    ) : RecyclerView.Adapter<MoonAdapter.MoonViewHolder>(){


        class MoonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val image1 : ImageView = itemView.findViewById(R.id.sky)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoonViewHolder {
            val view : View = LayoutInflater.from(context).inflate(R.layout.activity_moonsky,parent,false)
            return MoonViewHolder(view)
        }

        override fun getItemCount(): Int {
            return 3
        }

        override fun onBindViewHolder(holder: MoonViewHolder, position: Int) {

            holder.image1.setImageResource(imageList1[position])
        }
}