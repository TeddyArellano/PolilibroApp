package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalculatorUnit4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_unit4)

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, calculatorUnit1::class.java)
            startActivity(intent)
        }

        val btnSeriesDeTylor: Button = findViewById(R.id.btnSeriesDeTylor)
        btnSeriesDeTylor.setOnClickListener {
            val intent = Intent(this, CalculatorUnit4SerieTaylor::class.java)
            startActivity(intent)
        }
    }
}