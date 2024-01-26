package com.example.actividad2


import androidx.activity.ComponentActivity

class Act1 : ComponentActivity() {

    private fun List<Int>.sumar(): Int {
        var resultado = 0
        for (i in this) {
            resultado += i
        }
        return resultado
    }

    fun main(args: Array<String>) {
        val suma = listOf(1, 2, 3).sumar()
        println(suma)
    }

}