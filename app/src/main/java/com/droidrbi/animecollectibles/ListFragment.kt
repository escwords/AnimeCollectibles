package com.droidrbi.animecollectibles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.droidrbi.animecollectibles.databinding.FragmentListBinding
import com.droidrbi.animecollectibles.models.Collectible
import com.droidrbi.animecollectibles.utils.DatasetGenerator

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment(), CollectibleListAdapter.OnItemClickListener {

    lateinit var navController: NavController

    private lateinit var _listBinding: FragmentListBinding
    private lateinit var _dataset: ArrayList<Collectible>
    private lateinit var _adapter: CollectibleListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _listBinding = FragmentListBinding.inflate(inflater, container, false)
        _listBinding.collectibleListView.layoutManager = LinearLayoutManager(context)
        _listBinding.collectibleListView.hasFixedSize()
        _dataset = DatasetGenerator.generateData()
        _adapter = CollectibleListAdapter(_dataset, this)
        _listBinding.collectibleListView.adapter = _adapter
        _listBinding.collectibleListView.adapter
        return _listBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)


    }

    override fun onItemClick(collectible: Collectible) {
        navController.navigate(R.id.action_listFragment_to_detailFragment)
    }

}
