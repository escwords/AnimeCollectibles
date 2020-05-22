package com.droidrbi.animecollectibles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.droidrbi.animecollectibles.models.Collectible

class AboutActivity : AppCompatActivity() {

    lateinit var characterTextView: TextView
    lateinit var collectionTextView: TextView
    lateinit var costTextView: TextView
    lateinit var addToCartButton: Button
    lateinit var thumbnail: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        characterTextView = findViewById(R.id.characterTextView)
        collectionTextView = findViewById(R.id.collectionTextView)
        costTextView = findViewById(R.id.priceTextView)
        addToCartButton = findViewById(R.id.addToCartButton)
        thumbnail = findViewById(R.id.thumbnailImageView)

        val collectible = retrieveCollectible()

        updateUI(collectible)


    }

    private fun updateUI(collectible: Collectible) {

        if (collectible.thumbnail != 0){
            thumbnail.setImageResource(collectible.thumbnail)
        }
        if(collectible.cost == "SOLD OUT"){
            addToCartButton.text = getString(R.string.join_waitlist)
        }
        costTextView.text = collectible.cost
        characterTextView.text = collectible.character
        collectionTextView.text = collectible.collection

    }

    private fun retrieveCollectible(): Collectible {
        val intent = getIntent()
        val character  = intent.getStringExtra("character")
        val collection = intent.getStringExtra("collection")
        val cost = intent.getStringExtra("cost")
        val thumbnail = intent.getIntExtra("thumbnail", 0)

        return Collectible(thumbnail, character!!, collection!!, cost!!)
    }
}
