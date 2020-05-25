package com.droidrbi.animecollectibles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.droidrbi.animecollectibles.databinding.FragmentListBinding
import com.droidrbi.animecollectibles.models.Collectible

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    private lateinit var _mainBinding: FragmentListBinding
    private lateinit var _dataset: ArrayList<Collectible>
    private lateinit var _adapter: CollectibleListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
/*        _mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        _mainBinding.collectibleListView.layoutManager = LinearLayoutManager(this)
        _mainBinding.collectibleListView.hasFixedSize()
        _dataset = DatasetGenerator.generateData()
        _adapter = CollectibleListAdapter(_dataset)
        _mainBinding.collectibleListView.adapter = _adapter
        _mainBinding.collectibleListView.adapter*/
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

}
