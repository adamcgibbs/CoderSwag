package com.adamgibbs76.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.adamgibbs76.coderswag.Model.Product
import com.adamgibbs76.coderswag.R
import com.adamgibbs76.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_display.*

class ProductDisplayActivity : AppCompatActivity() {

    lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_display)

        product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        val resourceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)
        productImageView?.setImageResource(resourceId)
        productDetailText?.text = product.title
        productDetailPriceText?.text = product.price
    }

    fun addBtnClicked(view: View){
        Toast.makeText(this, "${product.title} added to Cart", Toast.LENGTH_SHORT).show()
    }
}
