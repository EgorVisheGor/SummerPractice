package com.example.practice.SecondHomewrok

import ThirdHomework.FirstFragment
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practice.R
import com.example.practice.databinding.FragmentMapBinding

class MapFragment : Fragment(R.layout.fragment_map) {

    private var _binding : FragmentMapBinding? = null
    private val binding  get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMapBinding.bind(view)

        with(binding){
            btnMap.setOnClickListener{
                findNavController().navigate(
                    R.id.action_mapFragment_to_firstFragment,
                    FirstFragment.createBundle(tvScreenName.text.toString())
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}