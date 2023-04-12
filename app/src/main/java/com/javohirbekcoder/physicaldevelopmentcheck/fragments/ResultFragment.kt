package com.javohirbekcoder.physicaldevelopmentcheck.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.javohirbekcoder.physicaldevelopmentcheck.R
import com.javohirbekcoder.physicaldevelopmentcheck.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {

    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResultBinding.inflate(inflater)
        val scores = requireArguments().getIntegerArrayList("scores")!!

        binding.tanaUzunlilgi.text = scores[0].toString()
        binding.tanaOgirligi.text = scores[1].toString()
        binding.qafasUzunligi.text = scores[2].toString()
        binding.yugurish10.text = scores[3].toString()
        binding.yugurish30.text = scores[4].toString()
        binding.yugurish300.text = scores[5].toString()
        binding.sakrash.text = scores[6].toString()
        binding.topUloqtirish.text = scores[7].toString()
        binding.qolBukish.text = scores[8].toString()
        binding.egiluvchanlik.text = scores[9].toString()

        binding.ortacha.text = scores.average().toString()

        binding.okBnt.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}