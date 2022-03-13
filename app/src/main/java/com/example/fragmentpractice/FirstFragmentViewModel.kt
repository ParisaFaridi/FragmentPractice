package com.example.fragmentpractice

import androidx.lifecycle.ViewModel

class FirstFragmentViewModel:ViewModel() {

    var number = 0
    fun increase(){
        number++
    }
}
