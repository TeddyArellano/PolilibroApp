package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.proyectodecalculo.Unit3.One.Activity313
import com.example.proyectodecalculo.Unit3.One.Activity314
import com.example.proyectodecalculo.Unit3.One.Activity315
import com.example.proyectodecalculo.Unit3.Two.Activity321
import com.example.proyectodecalculo.Unit3.Two.Activity322
import com.example.proyectodecalculo.Unit3.Two.Activity323
import com.example.proyectodecalculo.Unit3.Two.Activity324
import com.example.proyectodecalculo.Unit3.Three.Activity331
import com.example.proyectodecalculo.Unit3.Three.Activity332
import com.example.proyectodecalculo.Unit3.Three.Activity333
import com.example.proyectodecalculo.Unit3.Three.Activity334
import com.example.proyectodecalculo.Unit3.Three.Activity335
import com.example.proyectodecalculo.Unit3.Three.Activity336
import com.example.proyectodecalculo.Unit3.Three.Activity337
import com.example.proyectodecalculo.Unit3.Four.Activity341
import com.example.proyectodecalculo.Unit3.Four.Activity342
import com.example.proyectodecalculo.Unit3.Four.Activity343
import com.example.proyectodecalculo.Unit3.Four.Activity344
import com.example.proyectodecalculo.Unit3.One.Activity_311
import com.example.proyectodecalculo.Unit3.One.Activity_312

class Unit3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit3)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, UnitsActivity::class.java)
            startActivity(intent)
        }
        val btnEjercicios = findViewById<Button>(R.id.btnEjercicios)
        btnEjercicios.setOnClickListener {
            val intent = Intent(this, ListaUnidad3::class.java)
            startActivity(intent)
        }

        val btn311 = findViewById<Button>(R.id.btn311)
        btn311.setOnClickListener {
            val intent = Intent(this, Activity_311::class.java )
            startActivity(intent)
        }

        val btn312 = findViewById<Button>(R.id.btn312)
        btn312.setOnClickListener {
            val intent = Intent(this, Activity_312::class.java)
            startActivity(intent)
        }

        val btn313 = findViewById<Button>(R.id.btn313)
        btn313.setOnClickListener {
            val intent = Intent(this, Activity313::class.java)
            startActivity(intent)
        }

        val btn314 = findViewById<Button>(R.id.btn314)
        btn314.setOnClickListener {
            val intent = Intent(this, Activity314::class.java)
            startActivity(intent)
        }

        val btn315 = findViewById<Button>(R.id.btn315)
        btn315.setOnClickListener {
            val intent = Intent(this, Activity315::class.java)
            startActivity(intent)
        }


        val btn321 = findViewById<Button>(R.id.btn321)
        btn321.setOnClickListener {
            val intent = Intent(this, Activity321::class.java)
            startActivity(intent)
        }

        val btn322 = findViewById<Button>(R.id.btn322)
        btn322.setOnClickListener {
            val intent = Intent(this, Activity322::class.java)
            startActivity(intent)
        }

        val btn323 = findViewById<Button>(R.id.btn323)
        btn323.setOnClickListener {
            val intent = Intent(this, Activity323::class.java)
            startActivity(intent)
        }

        val btn324 = findViewById<Button>(R.id.btn324)
        btn324.setOnClickListener {
            val intent = Intent(this, Activity324::class.java)
            startActivity(intent)
        }

        val btn331 = findViewById<Button>(R.id.btn331)
        btn331.setOnClickListener {
            val intent = Intent(this, Activity331::class.java)
            startActivity(intent)
        }

        val btn332 = findViewById<Button>(R.id.btn332)
        btn332.setOnClickListener {
            val intent = Intent(this, Activity332::class.java)
            startActivity(intent)
        }

        val btn333 = findViewById<Button>(R.id.btn333)
        btn333.setOnClickListener {
            val intent = Intent(this, Activity333::class.java)
            startActivity(intent)
        }

        val btn334 = findViewById<Button>(R.id.btn334)
        btn334.setOnClickListener {
            val intent = Intent(this, Activity334::class.java)
            startActivity(intent)
        }

        val btn335 = findViewById<Button>(R.id.btn335)
        btn335.setOnClickListener {
            val intent = Intent(this, Activity335::class.java)
            startActivity(intent)
        }

        val btn336 = findViewById<Button>(R.id.btn336)
        btn336.setOnClickListener {
            val intent = Intent(this, Activity336::class.java)
            startActivity(intent)
        }

        val btn337 = findViewById<Button>(R.id.btn337)
        btn337.setOnClickListener {
            val intent = Intent(this, Activity337::class.java)
            startActivity(intent)
        }

        val btn341 = findViewById<Button>(R.id.btn341)
        btn341.setOnClickListener {
            val intent = Intent(this, Activity341::class.java)
            startActivity(intent)
        }

        val btn342 = findViewById<Button>(R.id.btn342)
        btn342.setOnClickListener {
            val intent = Intent(this, Activity342::class.java)
            startActivity(intent)
        }

        val btn343 = findViewById<Button>(R.id.btn343)
        btn343.setOnClickListener {
            val intent = Intent(this, Activity343::class.java)
            startActivity(intent)
        }

        val btn344 = findViewById<Button>(R.id.btn344)
        btn344.setOnClickListener {
            val intent = Intent(this, Activity344::class.java)
            startActivity(intent)
        }

        val btnCalculadoraUnit3 = findViewById<Button>(R.id.btnCalculadoraUnit3)
        btnCalculadoraUnit3.setOnClickListener {
            val intent = Intent(this, CalculatorUnit3::class.java)
            startActivity(intent)
        }
    }
}