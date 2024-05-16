package com.gonzalez.blanchard.demolivedata.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val _count = MutableLiveData(0)
    val count: LiveData<Int> = _count

    fun incrementCount(){
        _count.value = (_count.value ?: 0) + 1
    }

}