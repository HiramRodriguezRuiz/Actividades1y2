package com.example.actividad2

import androidx.activity.ComponentActivity

class Act2 : ComponentActivity() {
    fun main(args: Array<String>){
        val s1: String? =null
        val s2: String? =" "
        println(s1.esVaciaONula() == true)
        println(s2.esVaciaONula() == true)
    }
    private fun String?.esVaciaONula(): Boolean {
        return this == null || this.isEmpty()
    }
}