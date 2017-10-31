package com.ilmis.kotlin_recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.list_row.view.*

/**
 * Created by alwaris on 10/24/2017 AD.
 */
class RecyclerAdapter(var names: MutableList<String>,var career: MutableList<String>) :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = names[position]
        holder.career.text = career[position]
        

        holder.itemView.setOnClickListener{ }
    }

    override fun getItemCount(): Int {
      return names.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var view: View =  LayoutInflater.from(parent.context).inflate(R.layout.list_row,parent,false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

        val name: TextView = itemView.tvName
        val career: TextView = itemView.tvCareer


    }

}