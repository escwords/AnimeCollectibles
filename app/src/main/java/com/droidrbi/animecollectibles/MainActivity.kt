package com.droidrbi.animecollectibles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.droidrbi.animecollectibles.databinding.ActivityMainBinding
import com.droidrbi.animecollectibles.models.Collectible
import com.droidrbi.animecollectibles.utils.DatasetGenerator

class MainActivity : AppCompatActivity() {

    private lateinit var _mainBinding: ActivityMainBinding
    private lateinit var _dataset: ArrayList<Collectible>
    private lateinit var _adapter: CollectibleListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        _mainBinding.collectibleListView.layoutManager = LinearLayoutManager(this)
        _mainBinding.collectibleListView.hasFixedSize()
        _dataset = DatasetGenerator.generateData()
        _adapter = CollectibleListAdapter(_dataset)
        _mainBinding.collectibleListView.adapter = _adapter
        _mainBinding.collectibleListView.adapter

    }
}
