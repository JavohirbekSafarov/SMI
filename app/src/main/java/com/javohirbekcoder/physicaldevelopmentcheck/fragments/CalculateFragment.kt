package com.javohirbekcoder.physicaldevelopmentcheck.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.javohirbekcoder.physicaldevelopmentcheck.R
import com.javohirbekcoder.physicaldevelopmentcheck.data.Age6
import com.javohirbekcoder.physicaldevelopmentcheck.data.Age7
import com.javohirbekcoder.physicaldevelopmentcheck.databinding.FragmentCalculateBinding

class CalculateFragment : Fragment(R.layout.fragment_calculate) {

    private var _binding: FragmentCalculateBinding? = null
    private val binding get() = _binding!!

    private val scores = ArrayList<Int>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCalculateBinding.inflate(inflater)

        val age = requireArguments().getInt("age")

        binding.eraserBtn.setOnClickListener {
            binding.tanaUzunlilgi.text?.clear()
            binding.tanaOgirligi.text?.clear()
            binding.qafasUzunligi.text?.clear()
            binding.yugurish10.text?.clear()
            binding.yugurish30.text?.clear()
            binding.yugurish300.text?.clear()
            binding.sakrash.text?.clear()
            binding.topUloqtirish.text?.clear()
            binding.egiluvchanlik.text?.clear()
            binding.tanaUzunlilgi.requestFocus()
        }

        binding.calculateBtn.setOnClickListener {
            scores.clear()
            if (checkData()) {
                val tanaUzunligi = binding.tanaUzunlilgi.text.toString().toFloat()
                val tanaOgirligi = binding.tanaOgirligi.text.toString().toFloat()
                val kqa = binding.qafasUzunligi.text.toString().toFloat()
                val yugurish10 = binding.yugurish10.text.toString().toFloat()
                val yugurish30 = binding.yugurish30.text.toString().toFloat()
                val yugurish300 = binding.yugurish300.text.toString().toFloat()
                val sakrash = binding.sakrash.text.toString().toFloat()
                val uloqtirish = binding.topUloqtirish.text.toString().toFloat()
                val bukish = binding.qolBukish.text.toString().toInt()
                val egiluvchanlik = binding.egiluvchanlik.text.toString().toFloat()

                if (age == 6) {
                    var score = when (tanaUzunligi) {
                        in Age6.BOY_5..200.0f -> 5
                        in Age6.BOY_4..Age6.BOY_5 -> 4
                        in Age6.BOY_3..Age6.BOY_4 -> 3
                        in Age6.BOY_2..Age6.BOY_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (tanaOgirligi) {
                        in Age6.OGIRLIK_5..70.0f -> 5
                        in Age6.OGIRLIK_4..Age6.OGIRLIK_5 -> 4
                        in Age6.OGIRLIK_3..Age6.OGIRLIK_4 -> 3
                        in Age6.OGIRLIK_2..Age6.OGIRLIK_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (kqa) {
                        in Age6.KQA_5..200.0f -> 5
                        in Age6.KQA_4..Age6.KQA_5 -> 4
                        in Age6.KQA_3..Age6.KQA_4 -> 3
                        in Age6.KQA_2..Age6.KQA_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (yugurish10) {
                        in Age6.YUGURISH_10_5..1.0f -> 5
                        in Age6.YUGURISH_10_4..Age6.YUGURISH_10_5 -> 4
                        in Age6.YUGURISH_10_3..Age6.YUGURISH_10_4 -> 3
                        in Age6.YUGURISH_10_2..Age6.YUGURISH_10_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (yugurish30) {
                        in Age6.YUGURISH_30_5..1.0f -> 5
                        in Age6.YUGURISH_30_4..Age6.YUGURISH_30_5 -> 4
                        in Age6.YUGURISH_30_3..Age6.YUGURISH_30_4 -> 3
                        in Age6.YUGURISH_30_2..Age6.YUGURISH_30_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (yugurish300) {
                        in Age6.YUGURISH_300_5..1.0f -> 5
                        in Age6.YUGURISH_300_4..Age6.YUGURISH_300_5 -> 4
                        in Age6.YUGURISH_300_3..Age6.YUGURISH_300_4 -> 3
                        in Age6.YUGURISH_300_2..Age6.YUGURISH_300_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (sakrash) {
                        in Age6.SAKRASH_5..200.0f -> 5
                        in Age6.SAKRASH_4..Age6.SAKRASH_5 -> 4
                        in Age6.SAKRASH_3..Age6.SAKRASH_4 -> 3
                        in Age6.SAKRASH_2..Age6.SAKRASH_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (uloqtirish) {
                        in Age6.ULOQTIRISH_5..200.0f -> 5
                        in Age6.ULOQTIRISH_4..Age6.ULOQTIRISH_5 -> 4
                        in Age6.ULOQTIRISH_3..Age6.ULOQTIRISH_4 -> 3
                        in Age6.ULOQTIRISH_2..Age6.ULOQTIRISH_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (bukish) {
                        in Age6.BUKIB_YOZISH_5..10 -> 5
                        in Age6.BUKIB_YOZISH_4..Age6.BUKIB_YOZISH_5 -> 4
                        in Age6.BUKIB_YOZISH_3..Age6.BUKIB_YOZISH_4 -> 3
                        in Age6.BUKIB_YOZISH_2..Age6.BUKIB_YOZISH_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (egiluvchanlik) {
                        in Age6.EGILUVCHANLIK_5..10.0f -> 5
                        in Age6.EGILUVCHANLIK_4..Age6.EGILUVCHANLIK_5 -> 4
                        in Age6.EGILUVCHANLIK_3..Age6.EGILUVCHANLIK_4 -> 3
                        in Age6.EGILUVCHANLIK_2..Age6.EGILUVCHANLIK_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)

                    resultFragment(scores)
                } else if (age == 7) {

                    var score = when (tanaUzunligi) {
                        in Age7.BOY_5..200.0f -> 5
                        in Age7.BOY_4..Age7.BOY_5 -> 4
                        in Age7.BOY_3..Age7.BOY_4 -> 3
                        in Age7.BOY_2..Age7.BOY_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (tanaOgirligi) {
                        in Age7.OGIRLIK_5..70.0f -> 5
                        in Age7.OGIRLIK_4..Age7.OGIRLIK_5 -> 4
                        in Age7.OGIRLIK_3..Age7.OGIRLIK_4 -> 3
                        in Age7.OGIRLIK_2..Age7.OGIRLIK_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (kqa) {
                        in Age7.KQA_5..200.0f -> 5
                        in Age7.KQA_4..Age7.KQA_5 -> 4
                        in Age7.KQA_3..Age7.KQA_4 -> 3
                        in Age7.KQA_2..Age7.KQA_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (yugurish10) {
                        in Age7.YUGURISH_10_5..1.0f -> 5
                        in Age7.YUGURISH_10_4..Age7.YUGURISH_10_5 -> 4
                        in Age7.YUGURISH_10_3..Age7.YUGURISH_10_4 -> 3
                        in Age7.YUGURISH_10_2..Age7.YUGURISH_10_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (yugurish30) {
                        in Age7.YUGURISH_30_5..1.0f -> 5
                        in Age7.YUGURISH_30_4..Age7.YUGURISH_30_5 -> 4
                        in Age7.YUGURISH_30_3..Age7.YUGURISH_30_4 -> 3
                        in Age7.YUGURISH_30_2..Age7.YUGURISH_30_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (yugurish300) {
                        in Age7.YUGURISH_300_5..1.0f -> 5
                        in Age7.YUGURISH_300_4..Age7.YUGURISH_300_5 -> 4
                        in Age7.YUGURISH_300_3..Age7.YUGURISH_300_4 -> 3
                        in Age7.YUGURISH_300_2..Age7.YUGURISH_300_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (sakrash) {
                        in Age7.SAKRASH_5..200.0f -> 5
                        in Age7.SAKRASH_4..Age7.SAKRASH_5 -> 4
                        in Age7.SAKRASH_3..Age7.SAKRASH_4 -> 3
                        in Age7.SAKRASH_2..Age7.SAKRASH_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (uloqtirish) {
                        in Age7.ULOQTIRISH_5..200.0f -> 5
                        in Age7.ULOQTIRISH_4..Age7.ULOQTIRISH_5 -> 4
                        in Age7.ULOQTIRISH_3..Age7.ULOQTIRISH_4 -> 3
                        in Age7.ULOQTIRISH_2..Age7.ULOQTIRISH_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (bukish) {
                        in Age7.BUKIB_YOZISH_5..10 -> 5
                        in Age7.BUKIB_YOZISH_4..Age7.BUKIB_YOZISH_5 -> 4
                        in Age7.BUKIB_YOZISH_3..Age7.BUKIB_YOZISH_4 -> 3
                        in Age7.BUKIB_YOZISH_2..Age7.BUKIB_YOZISH_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)
                    score = when (egiluvchanlik) {
                        in Age7.EGILUVCHANLIK_5..10.0f -> 5
                        in Age7.EGILUVCHANLIK_4..Age7.EGILUVCHANLIK_5 -> 4
                        in Age7.EGILUVCHANLIK_3..Age7.EGILUVCHANLIK_4 -> 3
                        in Age7.EGILUVCHANLIK_2..Age7.EGILUVCHANLIK_3 -> 2
                        else -> {
                            1
                        }
                    }
                    scores.add(score)

                    resultFragment(scores)
                }
            }
        }

        return binding.root
    }

    private fun resultFragment(scores: java.util.ArrayList<Int>) {
        val bundle = Bundle()
        bundle.putIntegerArrayList("scores", scores)
        findNavController().navigate(R.id.action_calculateFragment_to_resultFragment, bundle)
    }

    private fun checkData(): Boolean {
        val errorText = "Kiritilmagan"

        if (binding.tanaUzunlilgi.text.toString().isEmpty()) {
            binding.tanaUzunlilgi.error = errorText
            binding.tanaUzunlilgi.requestFocus()
            return false
        } else if (binding.tanaOgirligi.text.toString().isEmpty()) {
            binding.tanaOgirligi.error = errorText
            binding.tanaOgirligi.requestFocus()
            return false
        } else if (binding.qafasUzunligi.text.toString().isEmpty()) {
            binding.qafasUzunligi.error = errorText
            binding.qafasUzunligi.requestFocus()
            return false
        } else if (binding.yugurish10.text.toString().isEmpty()) {
            binding.yugurish10.error = errorText
            binding.yugurish10.requestFocus()
            return false
        } else if (binding.yugurish30.text.toString().isEmpty()) {
            binding.yugurish30.error = errorText
            binding.yugurish30.requestFocus()
            return false
        } else if (binding.yugurish300.text.toString().isEmpty()) {
            binding.yugurish300.error = errorText
            binding.yugurish300.requestFocus()
            return false
        } else if (binding.sakrash.text.toString().isEmpty()) {
            binding.sakrash.error = errorText
            binding.sakrash.requestFocus()
            return false
        } else if (binding.topUloqtirish.text.toString().isEmpty()) {
            binding.topUloqtirish.error = errorText
            binding.topUloqtirish.requestFocus()
            return false
        } else if (binding.qolBukish.text.toString().isEmpty()) {
            binding.qolBukish.error = errorText
            binding.qolBukish.requestFocus()
            return false
        } else if (binding.egiluvchanlik.text.toString().isEmpty()) {
            binding.egiluvchanlik.error = errorText
            binding.egiluvchanlik.requestFocus()
            return false
        } else
            return true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
