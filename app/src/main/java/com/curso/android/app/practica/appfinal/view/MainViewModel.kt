package com.curso.android.app.practica.appfinal.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curso.android.app.practica.appfinal.model.EditText

class MainViewModel : ViewModel() {
    val resultLiveData: MutableLiveData<String> = MutableLiveData()

    fun compareStrings(input1: String, input2: String) {
        val comparison = EditText(input1, input2)
        val result = comparison.compareStrings()
        resultLiveData.value = result
    }
}