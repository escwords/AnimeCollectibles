package com.droidrbi.animecollectibles

import android.view.LayoutInflater
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
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return CollectibleViewHolder(itemView)
    }

    override fun getItemCount(): Int = _dataset.size

    override fun onBindViewHolder(holder: CollectibleViewHolder, position: Int) {
        val item = _dataset[position]
        holder.characterTextView.text = item.character
        holder.collectionTextView.text = item.collection
        holder.thumbnailImageView.setImageResource(item.thumbnail)
    }
}