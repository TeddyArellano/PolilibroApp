package com.example.proyectodecalculo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
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

class CalculatorUnit4SerieTaylor : AppCompatActivity() {
    private lateinit var etTaylorX: EditText
    private lateinit var etTaylorComp: EditText
    private lateinit var tvAnswer: TextView
    private lateinit var mvIMG: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {1
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_unit4_serie_taylor)

        mvIMG = findViewById(R.id.mvIMG)

        etTaylorX = findViewById(R.id.etTaylorX)
        etTaylorComp = findViewById(R.id.etTaylorComp)
        tvAnswer = findViewById(R.id.tvAnswer)
        val submitProblem: Button = findViewById(R.id.btnSubmit)

        val btnBack: Button = findViewById(R.id.btnBack)

        submitProblem.setOnClickListener {

            val to = etTaylorX.text.toString().trim { it <= ' '}
            val comp = etTaylorComp.text.toString().trim { it <= ' '}

            sendProblemToWolfram(to,comp)

        }

        btnBack.setOnClickListener {
            val intent = Intent(this, CalculatorUnit4::class.java)
            startActivity(intent)
        }
    }

    private fun sendProblemToWolfram(to: String, comp: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val client = OkHttpClient()
            val appId = "THGQ8J-KYKKEEVPWK"
            val prob = "Series[[//math:$comp)//], {[//math:x//], [//math:$to//], [//math:10//]}]"
            // val encodedProblem = URLEncoder.encode(prob, "UTF-8")
            val request = Request.Builder()
                .url("http://api.wolframalpha.com/v2/query?appid=$appId&input=$prob&podstate=Step-by-step%20solution")
                .build()

            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) throw IOException("Unexpected code $response")

                val responseBody = response.body?.string()
                if (responseBody != null) {
                    var (solutionSteps, imageUrl) = parseSolutionSteps(responseBody)
                    //...
                    // Traduce la solución al español
                    solutionSteps = translateToSpanish(solutionSteps)

                    launch(Dispatchers.Main) {
                        tvAnswer.text = solutionSteps
                        if (imageUrl != null) {
                            Glide.with(this@CalculatorUnit4SerieTaylor)
                                .load(imageUrl)
                                .into(mvIMG)
                        }
                    }
                }
            }
        }
    }

    private fun parseSolutionSteps(response: String): Pair<String, String?> {
        val factory = XmlPullParserFactory.newInstance()
        val parser = factory.newPullParser()
        parser.setInput(StringReader(response))

        val solutionSteps = StringBuilder()
        var imageUrl: String? = null
        var eventType = parser.eventType
        var isCorrectSubpod = false

        while (eventType != XmlPullParser.END_DOCUMENT) {
            when (eventType) {
                XmlPullParser.START_TAG -> {
                    if (parser.name == "subpod") {
                        for (i in 0 until parser.attributeCount) {
                            if (parser.getAttributeName(i) == "title" && parser.getAttributeValue(i) == "Possible intermediate steps") {
                                isCorrectSubpod = true
                            }
                        }
                    } else if (isCorrectSubpod && parser.name == "plaintext") {
                        eventType = parser.next()
                        if (eventType == XmlPullParser.TEXT) {
                            solutionSteps.append(parser.text).append("\n")
                        }
                    } else if (isCorrectSubpod && parser.name == "img") {
                        imageUrl = parser.getAttributeValue(null, "src")
                    }
                }
                XmlPullParser.END_TAG -> {
                    if (parser.name == "subpod") {
                        isCorrectSubpod = false
                    }
                }
            }
            eventType = parser.next()
        }
        return Pair(solutionSteps.toString(), imageUrl)
    }



    private fun translateToSpanish(text: String): String {
        val client = OkHttpClient()

        val mediaType = "application/x-www-form-urlencoded".toMediaType()
        val authKey = "b849c3c0-f728-0563-0fed-fb53f2048fc9:fx"
        val bodyContent = "text=${URLEncoder.encode(text, "UTF-8")}&target_lang=ES"
        val body: RequestBody = bodyContent.toRequestBody(mediaType)

        val request = Request.Builder()
            .url("https://api-free.deepl.com/v2/translate")
            .post(body)
            .addHeader("Authorization", "DeepL-Auth-Key $authKey")
            .build()

        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")

            val responseBody = response.body?.string()
            if (responseBody != null) {
                val json = JSONObject(responseBody)
                val translationsArray = json.getJSONArray("translations")
                val firstTranslationObject = translationsArray.getJSONObject(0)
                return firstTranslationObject.getString("text")
            }
        }
        return ""

    }


}