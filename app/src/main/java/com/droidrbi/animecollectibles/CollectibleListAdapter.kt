package com.droidrbi.animecollectibles

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.droidrbi.animecollectibles.databinding.ItemLayoutBinding
import com.droidrbi.animecollectibles.models.Collectible

class CollectibleListAdapter(
    private val _dataset: ArrayList<Collectible>,
    var itemClickListener: OnItemClickListener
) :
    RecyclerView.Adapter<CollectibleListAdapter.CollectibleViewHolder>() {

    class CollectibleViewHolder(_itemLayoutBinding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(_itemLayoutBinding.root) {

        var itemLayoutBinding: ItemLayoutBinding = _itemLayoutBinding

        fun bind(collectible: Collectible, clickListener: OnItemClickListener) {
            itemView.setOnClickListener {
                clickListener.onItemClick(collectible)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectibleViewHolder {
        val itemLayoutBinding = DataBindingUtil.inflate<ItemLayoutBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_layout,
            parent,
            false
        )

        return CollectibleViewHolder(itemLayoutBinding)
    }

    override fun getItemCount(): Int = _dataset.size

    override fun onBindViewHolder(holder: CollectibleViewHolder, position: Int) {
        val item = _dataset[position]
        holder.itemLayoutBinding.collectible = item
        holder.itemLayoutBinding.thumbnail.setImageResource(item.thumbnail)
        holder.bind(item, itemClickListener)
    }


    interface OnItemClickListener {
        fun onItemClick(collectible: Collectible)
    }
}