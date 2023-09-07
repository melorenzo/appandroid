package com.example.aplicacioncomparar.view
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    fun compararCadenas(str1: String, str2: String): String {
        return if (str1.equals(str2, ignoreCase = true)) {
            "Las cadenas son iguales."
        } else {
            "Las cadenas son diferentes."
        }
    }
}


