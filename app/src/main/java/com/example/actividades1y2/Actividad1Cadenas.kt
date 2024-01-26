package com.example.actividades1y2

import android.util.Log
import androidx.activity.ComponentActivity

class Actividad1Cadenas : ComponentActivity() {

    fun main(args: Array<String>) {
        // Llama a tu función de verificación aquí y utiliza Log
        logResultado("nombre", verificaCadena("nombre")) // true
        logResultado("_nombre", verificaCadena("_nombre")) // true
        logResultado("_12", verificaCadena("_12")) // true
        logResultado("vacia", verificaCadena(" ")) // false
        logResultado("012", verificaCadena("012")) // false
        logResultado("no$", verificaCadena("no$")) // false
    }

    // Resto del código...

    // Función de verificación de cadenas
    private fun verificaCadena(cadena: String): Boolean {
        if (cadena.isEmpty()) {
            return false
        }
        // Verificar que todos los caracteres consisten de letras, números o guion bajo
        val primerCaracter = cadena[0]
        if (!(primerCaracter.isLetter() || primerCaracter == '_')) {
            return false
        }
        // Si se cumplieron todos los criterios, devolver true
        for (caracter in cadena.substring(1)) {
            if (!(caracter.isLetterOrDigit() || caracter == '_')) {
                return false
            }
        }

        return true
    }

    // Función para loggear el resultado
    private fun logResultado(palabra: String, resultado: Boolean) {
        Log.d("ValidacionDeCadenas", "$palabra: $resultado")
    }
}