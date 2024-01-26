package com.example.actividad2

import androidx.activity.ComponentActivity

class Act3 : ComponentActivity() {
    private fun String.esFina(): Boolean {
        val condicionesCumplidas = listOf(
            !this.contains("bu") && !this.contains("ba") && !this.contains("be"),
            this.count { it.toLowerCase() in setOf('a', 'e', 'i', 'o', 'u') } >= 3,
            this.windowed(2).any { it[0] == it[1] }
        )

        return condicionesCumplidas.count { it } >= 2
    }
    fun main(args: Array<String>){
        println("bac".esFina())//false
        println("aza".esFina())//false
        println("abaca".esFina())//false
        println("baaa".esFina())//true
        println("aaab".esFina())//true
    }
}