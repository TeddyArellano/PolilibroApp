package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ListaUnidad3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_unidad3)

        val btnSucesiones = findViewById<Button>(R.id.btnSeriesPotencias)
        btnSucesiones.setOnClickListener {
            val intent = Intent(this, ListaSucesiones::class.java)
            startActivity(intent)
        }
        val btnSeries = findViewById<Button>(R.id.btnSeries)
        btnSeries.setOnClickListener {
            val intent = Intent(this, ListaSeries::class.java)
            startActivity(intent)
        }
        val btnConvergencia = findViewById<Button>(R.id.btnConvergencia)
        btnConvergencia.setOnClickListener {
            val intent = Intent(this, ListaConvergencia::class.java)
            startActivity(intent)
        }
        val btnAlternantes = findViewById<Button>(R.id.btnAlternantes)
        btnAlternantes.setOnClickListener {
            val intent = Intent(this, ListaAlternantes::class.java)
            startActivity(intent)
        }

        val btnActSucesiones = findViewById<Button>(R.id.btnActSucesiones)
        btnActSucesiones.setOnClickListener {
            val intent = Intent(this, ActividadSucesiones::class.java)
            startActivity(intent)
        }

        val btnActSeries = findViewById<Button>(R.id.btnActSeries)
        btnActSeries.setOnClickListener {
            val intent = Intent(this, ActividadSeries::class.java)
            startActivity(intent)
        }

    }
}