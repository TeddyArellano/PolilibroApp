package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener {
            Toast.makeText(this, "Has presionado el botón Inicio", Toast.LENGTH_SHORT).show()
            // Agrega aquí el código para manejar el botón Inicio
        }

        val btnUnits = findViewById<Button>(R.id.btnUnits)
        btnUnits.setOnClickListener {
            val intent = Intent(this, UnitsActivity::class.java)
            startActivity(intent)
        }

        val btnSettings = findViewById<Button>(R.id.btnSettings)
        btnSettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

    }

}