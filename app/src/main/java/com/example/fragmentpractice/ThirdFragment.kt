package com.example.fragmentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.fragmentpractice.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    val args:ThirdFragmentArgs by navArgs()
    lateinit var  binding:FragmentThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btn3GoTo4)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_forthFragment)
        }
        binding.textView.text = args.number.toString() + "   " + args.string
    }

}