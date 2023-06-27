package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.proyectodecalculo.Unit1.Activity142
import com.example.proyectodecalculo.Unit1.Activity143
import com.example.proyectodecalculo.Unit1.Activity145
import com.example.proyectodecalculo.Unit1.Activity_111
import com.example.proyectodecalculo.Unit1.Activity_112
import com.example.proyectodecalculo.Unit1.Activity_121
import com.example.proyectodecalculo.Unit1.Activity_122
import com.example.proyectodecalculo.Unit1.Activity_123
import com.example.proyectodecalculo.Unit1.Activity_131
import com.example.proyectodecalculo.Unit1.Activity_133
import com.example.proyectodecalculo.Unit1.Activity_141
import com.example.proyectodecalculo.Unit1.Activity_144

class Unit1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit1)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, UnitsActivity::class.java)
            startActivity(intent)}

        val btnEjercicios = findViewById<Button>(R.id.btnEjercicios)
        btnEjercicios.setOnClickListener {
            val intent = Intent(this, ListaUnidad1::class.java)
            startActivity(intent)
        }


        val btn111 = findViewById<Button>(R.id.btn111)
        btn111.setOnClickListener {
               val intent = Intent(this, Activity_111::class.java)
                startActivity(intent)
            }

        val btn112 = findViewById<Button>(R.id.btn112)
        btn112.setOnClickListener {
            val intent = Intent(this, Activity_112::class.java)
            startActivity(intent)
        }

        val btn121 = findViewById<Button>(R.id.btn121)
        btn121.setOnClickListener {
            val intent = Intent(this, Activity_121::class.java)
            startActivity(intent)
        }

        val btn122 = findViewById<Button>(R.id.btn122)
        btn122.setOnClickListener {
            val intent = Intent(this, Activity_122::class.java)
            startActivity(intent)
        }
        val btn123 = findViewById<Button>(R.id.btn123)
        btn123.setOnClickListener {
            val intent = Intent(this, Activity_123::class.java)
            startActivity(intent)
        }

        val btn131 = findViewById<Button>(R.id.btn131)
        btn131.setOnClickListener {
            val intent = Intent(this, Activity_131::class.java)
            startActivity(intent)
        }

        val btn132 = findViewById<Button>(R.id.btn132)
        btn132.setOnClickListener {
            val intent = Intent(this, Activity_133::class.java)
            startActivity(intent)
        }

        val btn141 = findViewById<Button>(R.id.btn141)
        btn141.setOnClickListener {
            val intent = Intent(this, Activity_141::class.java)
            startActivity(intent)
        }

        val btn142 = findViewById<Button>(R.id.btn142)
        btn142.setOnClickListener {
            val intent = Intent(this, Activity142::class.java)
            startActivity(intent)
        }

        val btn143 = findViewById<Button>(R.id.btn143)
        btn143.setOnClickListener {
            val intent = Intent(this, Activity143::class.java)
            startActivity(intent)
        }

        val btn144 = findViewById<Button>(R.id.btn144)
        btn144.setOnClickListener {
            val intent = Intent(this, Activity_144::class.java)
            startActivity(intent)
        }

        val btn145 = findViewById<Button>(R.id.btn145)
        btn145.setOnClickListener {
            val intent = Intent(this, Activity145::class.java)
            startActivity(intent)
        }

        val btnCalculadoraUnit1 = findViewById<Button>(R.id.btnCalculadoraUnit1)
        btnCalculadoraUnit1.setOnClickListener {
            val intent = Intent(this, calculatorUnit1::class.java)
            startActivity(intent)
        }

        }
    }