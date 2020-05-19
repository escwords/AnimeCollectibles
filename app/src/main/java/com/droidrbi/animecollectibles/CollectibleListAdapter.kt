package com.droidrbi.animecollectibles

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.droidrbi.animecollectibles.models.Collectible

class CollectibleListAdapter(private val _dataset:ArrayList<Collectible>):
    RecyclerView.Adapter<CollectibleListAdapter.CollectibleViewHolder>() {

    class CollectibleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var characterTextView: TextView
        var thumbnailImageView: ImageView
        var collectionTextView: TextView
        init {
            characterTextView =itemView.findViewById(R.id.characterTextView)
            thumbnailImageView = itemView.findViewById(R.id.thumbnail)
            collectionTextView = itemView.findViewById(R.id.collectionTextView)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectibleViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CollectibleViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}