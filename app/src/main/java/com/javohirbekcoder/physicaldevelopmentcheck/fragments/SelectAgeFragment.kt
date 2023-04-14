package com.javohirbekcoder.physicaldevelopmentcheck.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.javohirbekcoder.physicaldevelopmentcheck.R
import com.javohirbekcoder.physicaldevelopmentcheck.databinding.FragmentSelectAgeBinding

class SelectAgeFragment : Fragment(R.layout.fragment_select_age) {

    private var _binding: FragmentSelectAgeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSelectAgeBinding.inflate(inflater)

        val bundle = Bundle()
        binding.age6.setOnClickListener {
            bundle.putInt("age", 6)
            findNavController().navigate(R.id.action_selectAgeFragment_to_calculateFragment, bundle)
        }
        binding.age7.setOnClickListener {
            bundle.putInt("age", 7)
            findNavController().navigate(R.id.action_selectAgeFragment_to_calculateFragment, bundle)
        }
        binding.infoLayout.setOnClickListener {
            findNavController().navigate(R.id.action_selectAgeFragment_to_infoFragment)
        }
        return binding.root
    }
}