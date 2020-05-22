package com.droidrbi.animecollectibles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AboutActivity : AppCompatActivity() {

    lateinit var characterTextView: TextView
    lateinit var collectionTextView: TextView
    lateinit var costTextView: TextView
    lateinit var addToCartButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        characterTextView = findViewById(R.id.characterTextView)
        collectionTextView = findViewById(R.id.collectionTextView)
        costTextView = findViewById(R.id.priceTextView)
        addToCartButton = findViewById(R.id.addToCartButton)


    }
}
