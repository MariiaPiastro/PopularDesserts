package com.geekhub.mariia_piastro.populardesserts

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var desserts: ArrayList<Desserts> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createDessert()
        val dessertAdapter = DessertAdapter(this, desserts)
        recyclerView.adapter = dessertAdapter
    }

    private fun createDessert() {
        val titles = resources.getStringArray(R.array.desserts)
        val dessertsInfo = resources.getStringArray(R.array.desserts_info)
        var i = 0

        while (i < titles.size) {
            val image = resources.getIdentifier("dessert$i", "drawable", packageName)
            desserts.add(Desserts(titles[i], dessertsInfo[i], image))
            i++
        }
    }
}

