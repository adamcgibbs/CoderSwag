package com.adamgibbs76.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.adamgibbs76.coderswag.Adapters.CategoryAdapter
import com.adamgibbs76.coderswag.Model.Category
import com.adamgibbs76.coderswag.R
import com.adamgibbs76.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService. categories)
        categoryListView.adapter = adapter


    }
}
