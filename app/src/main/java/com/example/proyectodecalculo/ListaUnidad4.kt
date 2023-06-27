package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ListaUnidad4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_unidad4)

        val btnSeriesPotencias = findViewById<Button>(R.id.btnSeriesPotencias)
        btnSeriesPotencias.setOnClickListener {
            val intent = Intent(this, ListaSeriesPotencias::class.java)
            startActivity(intent)
        }

        val btnTylor = findViewById<Button>(R.id.btnTylor)
        btnTylor.setOnClickListener {
            val intent = Intent(this, ListaTylor::class.java)
            startActivity(intent)
        }


    }
}