package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ListaUnidad1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_unidad1)

        val btnArea = findViewById<Button>(R.id.btnArea)
        btnArea.setOnClickListener {
            val intent = Intent(this, AreaBajolaCurva::class.java)
            startActivity(intent)
        }

        val btnDefinida = findViewById<Button>(R.id.btnDefinida)
        btnDefinida.setOnClickListener {
            val intent = Intent(this, Integral_Definida::class.java)
            startActivity(intent)
        }

        val btnNumerica = findViewById<Button>(R.id.btnNumerica)
        btnNumerica.setOnClickListener {
            val intent = Intent(this, Integracion_Numerica::class.java)
            startActivity(intent)
        }

        val btnActIntegral = findViewById<Button>(R.id.btnActIntegral)
        btnActIntegral.setOnClickListener {
            val intent = Intent(this, ActAplicacion::class.java)
            startActivity(intent)
        }

        val btnAplicacion = findViewById<Button>(R.id.btnAplicacion)
        btnAplicacion.setOnClickListener {
            val intent = Intent(this, Aplicacion_Integral::class.java)
            startActivity(intent)
        }

        val btnActNumerica = findViewById<Button>(R.id.btnActNumerica)
        btnActNumerica.setOnClickListener {
            val intent = Intent(this, ActNumerica::class.java)
            startActivity(intent)
        }

    }
}