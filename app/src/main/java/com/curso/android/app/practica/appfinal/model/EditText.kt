package com.curso.android.app.practica.appfinal.model

data class EditText(val input1: String, val input2: String) {

    fun compareStrings(): String {
        return if (input1 == input2) {
            "Las cadenas son idénticas."
        } else {
            "Las cadenas son diferentes."
        }
    }
}
