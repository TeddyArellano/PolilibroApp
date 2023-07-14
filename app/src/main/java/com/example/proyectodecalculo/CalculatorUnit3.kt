package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalculatorUnit3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_unit3)

        val btnCriterioConvergencia: Button = findViewById(R.id.btnCriterioConvergencia)
        val btnBack: Button = findViewById(R.id.btnBack)

        btnCriterioConvergencia.setOnClickListener {
            val intent = Intent(this, CalculatorUnit3CriterioConvergencia::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            val intent = Intent(this, Unit3Activity::class.java)
            startActivity(intent)
        }


    }
}