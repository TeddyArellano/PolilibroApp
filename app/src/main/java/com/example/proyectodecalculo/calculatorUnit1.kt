package com.example.proyectodecalculo

import android.os.Bundle
import android.widget.Button
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import org.json.JSONException
import org.json.JSONObject
import org.w3c.dom.Text
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.io.IOException
import java.io.StringReader
import java.net.URLEncoder

class calculatorUnit1 : AppCompatActivity() {

    private lateinit var etIntegralEnd: EditText
    private lateinit var etIntegralComplement: EditText
    private lateinit var etIntegralStart: EditText
    private lateinit var tvOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_calculator_unit1)

            etIntegralEnd = findViewById(R.id.etIntegralEnd)
            etIntegralComplement = findViewById(R.id.etIntegralComplement)
            etIntegralStart = findViewById(R.id.etIntegralStart)
            tvOutput = findViewById(R.id.tvOutput)

            val submitProblem: Button = findViewById(R.id.btnSubmit)

            submitProblem.setOnClickListener {
                val end = etIntegralEnd.text.toString()
                val complement = etIntegralComplement.text.toString()
                val start = etIntegralStart.text.toString()

                    sendProblemToWolfram(end, complement, start)

            }
        }

        private fun sendProblemToWolfram(end: String, complement: String, start: String) {
            CoroutineScope(Dispatchers.IO).launch {
                val client = OkHttpClient()
                val appId = "THGQ8J-KYKKEEVPWK"
                val problem = "Integrate[$complement,{x,$start,$end}]"
                print(problem)
                val encodedProblem = URLEncoder.encode(problem, "UTF-8")
                val request = Request.Builder()
                    .url("http://api.wolframalpha.com/v2/query?appid=$appId&input=$encodedProblem&podstate=Step-by-step%20solution")
                    .build()

                client.newCall(request).execute().use { response ->
                    if (!response.isSuccessful) throw IOException("Unexpected code $response")

                    val responseBody = response.body?.string()
                    if (responseBody != null) {
                        var solutionSteps = parseSolutionSteps(responseBody)

                        // Traduce la solución al español
                        solutionSteps = translateToSpanish(solutionSteps)

                        launch(Dispatchers.Main) {
                            tvOutput.text = solutionSteps
                        }
                    }
                }
            }
        }

        private fun parseSolutionSteps(response: String): String {
            val factory = XmlPullParserFactory.newInstance()
            val parser = factory.newPullParser()
            parser.setInput(StringReader(response))

            val solutionSteps = StringBuilder()
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
            return solutionSteps.toString()
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
