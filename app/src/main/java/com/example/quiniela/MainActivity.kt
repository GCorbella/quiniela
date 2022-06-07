package com.example.quiniela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultadoenpantalla: TextView = findViewById(R.id.texto_Resultado)
        val botonPantalla: Button = findViewById(R.id.button_calcularJugada)
        botonPantalla.setOnClickListener{
            val notificacionCorta = Toast.makeText(this,"Calculando jugada",Toast.LENGTH_SHORT)
            notificacionCorta.show()
            var listaResultados = ""
            for (i in 1..14){
                val aleatorio = (1..100).random()
                if (aleatorio<50){
                    listaResultados = listaResultados + "1\n"
                }
                else if (aleatorio<75){
                    listaResultados = listaResultados + "X\n"
                }
                else {
                    listaResultados = listaResultados + "2\n"
                }
            }
            resultadoenpantalla.text = listaResultados
        }
    }
}