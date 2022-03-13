package com.example.fragmentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.fragmentpractice.databinding.FragmentFistBinding

class FistFragment : Fragment() {
    lateinit var binding : FragmentFistBinding
    val viewModel: FirstFragmentViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFistBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView2.text = viewModel.number.toString()
        val button2 = view.findViewById<Button>(R.id.btnGoTo2)
        val bundle = bundleOf("text" to "Parisa" , "visibility" to false)
        button2.setOnClickListener {
            findNavController().navigate(R.id.action_fistFragment_to_secondFragment , bundle)
        }
        val button3 = view.findViewById<Button>(R.id.btnGoTo3)
        button3.setOnClickListener {
            findNavController().navigate(R.id.action_fistFragment_to_thirdFragment)
        }
        val button4 = view.findViewById<Button>(R.id.btnGoTo4)
        button4.setOnClickListener {
            findNavController().navigate(R.id.action_fistFragment_to_forthFragment)
        }

        binding.button.setOnClickListener {
            viewModel.increase()
            binding.textView2.text = viewModel.number.toString()
        }

    }

}