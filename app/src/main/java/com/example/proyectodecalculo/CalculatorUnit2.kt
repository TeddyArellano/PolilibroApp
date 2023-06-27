package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalculatorUnit2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_unit2)
        val btnReglaLHopital: Button = findViewById(R.id.btnReglaLHopital)
        val btnBack: Button = findViewById(R.id.btnBack)

        btnReglaLHopital.setOnClickListener {
            val intent = Intent(this, CalculatorUnit2ReglaLHopital::class.java)
            startActivity(intent)
        }


        btnBack.setOnClickListener {
            val intent = Intent(this, Unit2Activity::class.java)
            startActivity(intent)
        }


    }
}