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

        val btnIntroduction = findViewById<Button>(R.id.btnIntroduction)
        btnIntroduction.setOnClickListener {
            val intent = Intent(this, IntroductionActivity::class.java)
            startActivity(intent)
        }

        val btnOrganization = findViewById<Button>(R.id.btnOrganization)
        btnOrganization.setOnClickListener {
            val intent = Intent(this, OrganizationActivity::class.java)
            startActivity(intent)
        }

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener {
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

        val btnCalculadorasUnits = findViewById<Button>(R.id.btnCalculadorasUnits)
        btnCalculadorasUnits.setOnClickListener {
            val intent = Intent(this, CalculadorasActivity::class.java)
            startActivity(intent)
        }





    }

}