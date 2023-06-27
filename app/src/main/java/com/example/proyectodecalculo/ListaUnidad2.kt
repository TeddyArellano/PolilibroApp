package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ListaUnidad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_unidad2)

        val btnIndeterminadas = findViewById<Button>(R.id.btnSeriesPotencias)
        btnIndeterminadas.setOnClickListener {
            val intent = Intent(this, ListaIndeterminadas::class.java)
            startActivity(intent)
        }

        val btnInpropias = findViewById<Button>(R.id.btnTylor)
        btnInpropias.setOnClickListener {
            val intent = Intent(this, ListaInpropias::class.java)
            startActivity(intent)
        }

        val btnActIndeterminadas = findViewById<Button>(R.id.btnActIndeterminadas)
        btnActIndeterminadas.setOnClickListener {
            val intent = Intent(this, ActIndeterminadas::class.java)
            startActivity(intent)
        }

        val btnActIInpropias = findViewById<Button>(R.id.btnActIInpropias)
        btnActIInpropias.setOnClickListener {
            val intent = Intent(this, ActInpropias::class.java)
            startActivity(intent)
        }

    }
}