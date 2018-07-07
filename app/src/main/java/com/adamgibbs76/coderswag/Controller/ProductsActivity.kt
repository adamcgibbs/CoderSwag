package com.adamgibbs76.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.adamgibbs76.coderswag.R
import com.adamgibbs76.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        println(categoryType)
    }
}
