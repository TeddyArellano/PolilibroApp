package com.example.proyectodecalculo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener {
            Toast.makeText(this, "Has presionado el botón Inicio", Toast.LENGTH_SHORT).show()
            // Agrega aquí el código para manejar el botón Inicio
        }

        val btnUnits = findViewById<Button>(R.id.btnUnits)
        btnUnits.setOnClickListener {
            Toast.makeText(this, "Has presionado el botón Unidades", Toast.LENGTH_SHORT).show()
            // Agrega aquí el código para manejar el botón Unidades
        }

        val btnSettings = findViewById<Button>(R.id.btnSettings)
        btnSettings.setOnClickListener {

        }

    }
}