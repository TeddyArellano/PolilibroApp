package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Unit2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit2)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, UnitsActivity::class.java)
            startActivity(intent)
        }
        val btn211Introduction = findViewById<Button>(R.id.btn211Introduction)
        btn211Introduction.setOnClickListener {
            val intent = Intent(this, Activity_211::class.java)
            startActivity(intent)
        }
        val btn212LHopital = findViewById<Button>(R.id.btn212LHopital)
        btn212LHopital.setOnClickListener {
            val intent = Intent(this, Activity_212::class.java)
            startActivity(intent)
        }
        val btn213ProductoInd = findViewById<Button>(R.id.btn213ProductoInd)
        btn213ProductoInd.setOnClickListener {
            val intent = Intent(this, Activity_213::class.java)
            startActivity(intent)
        }
        val btn214DiferenciaInd = findViewById<Button>(R.id.btn214DiferenciaInd)
        btn214DiferenciaInd.setOnClickListener {
            val intent = Intent(this, Activity_214::class.java)
            startActivity(intent)
        }
        val btn215PotenciasInd = findViewById<Button>(R.id.btn215PotenciasInd)
        btn215PotenciasInd.setOnClickListener {
            val intent = Intent(this, Activity_215::class.java)
            startActivity(intent)
        }
        val btn221Introduccion = findViewById<Button>(R.id.btn221Introduccion)
        btn221Introduccion.setOnClickListener {
            val intent = Intent(this, Activity_221::class.java)
            startActivity(intent)
        }
        val btn222IntegralesImp = findViewById<Button>(R.id.btn222IntegralesImp)
        btn222IntegralesImp.setOnClickListener {
            val intent = Intent(this, Activity_222::class.java)
            startActivity(intent)
        }
        val btn223IntegralesDisc = findViewById<Button>(R.id.btn223)
        btn223IntegralesDisc.setOnClickListener {
            val intent = Intent(this, Activity_223::class.java)
            startActivity(intent)
        }

        val btnCalculadoraUnit2 = findViewById<Button>(R.id.btnCalculadoraUnit2)
        btnCalculadoraUnit2.setOnClickListener {
            val intent = Intent(this, CalculatorUnit2::class.java)
            startActivity(intent)
        }
    }
}