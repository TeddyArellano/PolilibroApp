package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalculadorasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadoras)

        val btnReglaLHopital: Button = findViewById(R.id.btnReglaLHopital)
        val btnIntegralesDefinidas: Button = findViewById(R.id.btnIntegralesDefinidas)
        val btnIntegralesIndefinidas: Button = findViewById(R.id.btnIntegralesIndefinidas)
        val btnCriterioConvergencia: Button = findViewById(R.id.btnCriterioConvergencia)
        val btnBack: Button = findViewById(R.id.btnBack)

        btnReglaLHopital.setOnClickListener {
            val intent = Intent(this, CalculatorUnit2ReglaLHopital::class.java)
            startActivity(intent)
        }

        btnIntegralesDefinidas.setOnClickListener {
            val intent = Intent(this, CalculatorUnit1IntegralDef::class.java)
            startActivity(intent)
        }

        btnIntegralesIndefinidas.setOnClickListener {
            val intent = Intent(this, CalculatorUnit1IntegralIndef::class.java)
            startActivity(intent)
        }

        btnCriterioConvergencia.setOnClickListener {
            val intent = Intent(this, CalculatorUnit3CriterioConvergencia::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnSeriesDeTylor: Button = findViewById(R.id.btnSeriesDeTylor)
        btnSeriesDeTylor.setOnClickListener {
            val intent = Intent(this, CalculatorUnit4SerieTaylor::class.java)
            startActivity(intent)
        }

    }


}