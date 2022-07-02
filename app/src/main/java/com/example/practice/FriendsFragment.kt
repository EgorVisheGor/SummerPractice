package com.example.practice
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practice.databinding.FragmentFriendsBinding

class FriendsFragment : Fragment(R.layout.fragment_friends) {

    private var _binding : FragmentFriendsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFriendsBinding.bind(view)

        with(binding){
            btnFriends.setOnClickListener{
                findNavController().navigate(R.id.action_friendsFragment_to_firstFragment,
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