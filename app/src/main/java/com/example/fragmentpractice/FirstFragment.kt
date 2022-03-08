package com.example.fragmentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class FistFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fist, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

    }
}