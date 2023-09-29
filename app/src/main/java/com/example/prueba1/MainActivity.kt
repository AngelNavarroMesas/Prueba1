package com.example.prueba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var PI:Double = 3.1416
        var numero:Int = 7
        var resultado:Double = PI+numero
        var exponente:Int = 3

        Log.d("Etiqueta", "el "+numero+" elevado a"+exponente+" es igual a"+potencia(numero, exponente))
    }

    private fun potencia(numero: Int, exponente: Int): Int {
        var resultado:Int = Math.pow(numero.toDouble(), exponente.toDouble()).toInt()
        return resultado
    }


}