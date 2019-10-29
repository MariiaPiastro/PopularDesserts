package com.geekhub.mariia_piastro.populardesserts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dessert_detail.*

class DessertDetailActivity : AppCompatActivity() {

    private val title = "title"
    private val info = "info"
    private val image = "image"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert_detail)

        textViewTitleDessertDetailActivity.text = intent.getStringExtra(title)
        textViewDessertInfoDetailActivity.text = intent.getStringExtra(info)
        val image = intent.getIntExtra(image,0)
        imageViewDessertDetailActivity.setImageResource(image)
    }
}
