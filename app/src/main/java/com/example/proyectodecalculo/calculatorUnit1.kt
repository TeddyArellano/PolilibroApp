package com.example.proyectodecalculo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.io.IOException
import java.io.StringReader
import java.net.URLEncoder

class calculatorUnit1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_unit1)

        val btnIntegralesDefinidas: Button = findViewById(R.id.btnIntegralesDefinidas)
        val btnIntegralesIndefinidas: Button = findViewById(R.id.btnIntegralesIndefinidas)
        val btnBack: Button = findViewById(R.id.btnBack)

        btnIntegralesDefinidas.setOnClickListener {
            val intent = Intent(this, CalculatorUnit1IntegralDef::class.java)
            startActivity(intent)
        }

        btnIntegralesIndefinidas.setOnClickListener {
            val intent = Intent(this, CalculatorUnit1IntegralIndef::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            val intent = Intent(this, Unit1Activity::class.java)
            startActivity(intent)
        }


    }


}
