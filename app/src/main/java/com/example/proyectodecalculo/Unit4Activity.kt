package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.proyectodecalculo.Unit4.Activity411
import com.example.proyectodecalculo.Unit4.Activity412
import com.example.proyectodecalculo.Unit4.Activity421
import com.example.proyectodecalculo.Unit4.Activity422

class Unit4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit4)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, UnitsActivity::class.java)
            startActivity(intent)
        }
        val btnEjercicios = findViewById<Button>(R.id.btnEjercicios)
        btnEjercicios.setOnClickListener {
            val intent = Intent(this, ListaUnidad4::class.java)
            startActivity(intent)
        }

        val btn411 = findViewById<Button>(R.id.btn411)
        btn411.setOnClickListener {
            val intent = Intent(this, Activity411::class.java)
            startActivity(intent)
        }

        val btn412 = findViewById<Button>(R.id.btn412)
        btn412.setOnClickListener {
            val intent = Intent(this, Activity412::class.java)
            startActivity(intent)
        }

        val btn421 = findViewById<Button>(R.id.btn421)
        btn421.setOnClickListener {
            val intent = Intent(this, Activity421::class.java)
            startActivity(intent)
        }

        val btn422 = findViewById<Button>(R.id.btn422)
        btn422.setOnClickListener {
            val intent = Intent(this, Activity422::class.java)
            startActivity(intent)
        }

        val btnCalculadoraUnit4 = findViewById<Button>(R.id.btnCalculadoraUnit4)
        btnCalculadoraUnit4.setOnClickListener {
            val intent = Intent(this, CalculatorUnit4::class.java)
            startActivity(intent)
        }
    }
}