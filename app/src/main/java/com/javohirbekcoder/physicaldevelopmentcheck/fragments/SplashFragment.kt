package com.javohirbekcoder.physicaldevelopmentcheck.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.javohirbekcoder.physicaldevelopmentcheck.R
import com.javohirbekcoder.physicaldevelopmentcheck.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashBinding.inflate(inflater)

        Handler(Looper.getMainLooper()).postDelayed({
            lifecycleScope.launchWhenResumed {
                findNavController().navigate(R.id.action_splashFragment_to_selectAgeFragment)
            }
        }, 2400)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}