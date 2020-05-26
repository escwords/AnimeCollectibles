package com.droidrbi.animecollectibles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.droidrbi.animecollectibles.databinding.FragmentDetailBinding
import com.droidrbi.animecollectibles.models.Collectible

/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment() {

    private lateinit var _detailBinding: FragmentDetailBinding
    private lateinit var _collectible: Collectible

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _detailBinding = FragmentDetailBinding.inflate(inflater, container, false)
        val args = DetailFragmentArgs.fromBundle(requireArguments())
        _collectible = args.collectible
        _detailBinding.collectible = _collectible
        return _detailBinding.root
    }


}
