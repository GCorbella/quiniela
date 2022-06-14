package com.example.quiniela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultadoenpantalla: TextView = findViewById(R.id.texto_Resultado)
        val botonPantalla: Button = findViewById(R.id.button_calcularJugada)
        val numPartidos: EditText = findViewById(R.id.editTextNumPartidos)


        botonPantalla.setOnClickListener{
            var total = numPartidos.text.toString().toInt()
            if (total > 15){
                val notificacionerror = Toast.makeText(this,"El máximo de partidos es 15",Toast.LENGTH_LONG)
                notificacionerror.show()
                total = 15
            }
            //val notificacionCorta = Toast.makeText(this,"Calculando jugada",Toast.LENGTH_SHORT)
            //notificacionCorta.show()
            var listaResultados = ""
            for (i in 1..total){
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