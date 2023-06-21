package com.example.proyectodecalculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class UnitsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_units)

        val btnUnit1 = findViewById<Button>(R.id.btnUnit1)
        btnUnit1.setOnClickListener {
            val intent = Intent(this, Unit1Activity::class.java)
            startActivity(intent)
        }

        val btnUnit2 = findViewById<Button>(R.id.btnUnit2)
        btnUnit2.setOnClickListener {
            val intent = Intent(this, Unit2Activity::class.java)
            startActivity(intent)
        }

        val btnUnit3 = findViewById<Button>(R.id.btnUnit3)
        btnUnit3.setOnClickListener {
            val intent = Intent(this, Unit3Activity::class.java)
            startActivity(intent)
        }

        val btnUnit4 = findViewById<Button>(R.id.btnUnit4)
        btnUnit4.setOnClickListener {
            val intent = Intent(this, Unit4Activity::class.java)
            startActivity(intent)
        }

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnUnits = findViewById<Button>(R.id.btnUnits)
        btnUnits.setOnClickListener {
        }

        val btnSettings = findViewById<Button>(R.id.btnSettings)
        btnSettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
            }

    }
}