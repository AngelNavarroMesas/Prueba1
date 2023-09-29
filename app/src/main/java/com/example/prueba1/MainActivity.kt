package com.example.prueba1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.prueba1.databinding.OtraVistaBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val otravista= OtraVistaBinding.inflate(layoutInflater)
        setContentView(otravista.root)
        val boton = findViewById<Button>(R.id.button)
        boton.text = "Pulsa aqui"
        var texto = findViewById<TextView>(R.id.textView2)
        texto.text = "hola buenas tardes"

        otravista.textView2.setBackgroundColor(R.color.azul)

        otravista.button.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?){
                val toast = Toast.makeText(
                    applicationContext,
                    "¡¡Me has pulsado!!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        //var PI:Double = 3.1416
        //var numero:Int = 7
        //var resultado:Double = PI+numero
        //var exponente:Int = 3

        //Log.d("Etiqueta", "el "+numero+" elevado a"+exponente+" es igual a"+potencia(numero, exponente))

    }

    private fun potencia(numero: Int, exponente: Int): Int {
        var resultado:Int = Math.pow(numero.toDouble(), exponente.toDouble()).toInt()
        return resultado
    }


}