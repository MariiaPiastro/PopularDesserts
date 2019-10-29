package com.geekhub.mariia_piastro.populardesserts

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class DessertAdapter(context: Context, private val desserts: ArrayList<Desserts>) :
    RecyclerView.Adapter<DessertAdapter.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view: View = inflater.inflate(R.layout.list_item, p0, false)
        // view.setOnClickListener(this)
        return ViewHolder(view)
    }

//    override fun onClick(v: View) {
//        val intent = Intent(v.context, DessertDetailActivity::class.java )
//        intent.putExtra("title", "dessert")
//        v.context.startActivity(intent)
//    }

    override fun getItemCount(): Int {
        return desserts.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bind(desserts[p1])
        p0.itemView.setOnClickListener { v ->
            val intent = Intent(v.context, DessertDetailActivity::class.java)
            intent.putExtra("title", desserts[p1].title)
            intent.putExtra("info", desserts[p1].info)
            intent.putExtra("image",desserts[p1].image)
            v.context.startActivity(intent)
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)  {
        private val dessertTitle = view.findViewById<TextView>(R.id.TextViewTitleDessert)
        private val dessertImageView = view.findViewById<ImageView>(R.id.imageViewDessert)

        fun bind(desserts: Desserts) {
            dessertTitle.text = desserts.title
            dessertImageView.setImageResource(desserts.image)
        }
    }
}