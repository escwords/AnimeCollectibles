package com.droidrbi.animecollectibles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.droidrbi.animecollectibles.models.Collectible
import com.droidrbi.animecollectibles.utils.DatasetGenerator

class MainActivity : AppCompatActivity(), CollectibleListAdapter.OnItemClickListener {


    private lateinit var _dataset: ArrayList<Collectible>
    private lateinit var _adapter: CollectibleListAdapter
    private lateinit var _recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _recyclerView = findViewById(R.id.collectibleListView)
        _dataset = DatasetGenerator.generateData()
        _adapter = CollectibleListAdapter(_dataset, this)
        val layoutManager = LinearLayoutManager(applicationContext)
        _recyclerView.layoutManager = layoutManager
        _recyclerView.adapter = _adapter
        _adapter.notifyDataSetChanged()
    }

    override fun onItemClick(collectible: Collectible) {
        openAboutProduct(collectible)
    }

    private fun openAboutProduct(collectible: Collectible) {
        val intent = Intent(this@MainActivity, AboutActivity::class.java)
        intent.putExtra("character", collectible.character)
        intent.putExtra("collection", collectible.collection)
        intent.putExtra("thumbnail", collectible.thumbnail)
        intent.putExtra("cost", collectible.cost)
        startActivity(intent)
    }
}


