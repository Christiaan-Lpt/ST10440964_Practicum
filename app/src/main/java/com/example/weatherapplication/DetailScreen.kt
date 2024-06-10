package com.example.weatherapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailScreen : AppCompatActivity() {

    private lateinit var textViewDetails: TextView
    private lateinit var buttonBackMain: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_view_screen)

        textViewDetails = findViewById(R.id.textViewDetails)
        buttonBackMain = findViewById(R.id.buttonBackMain)

        val minTemps = intent.getStringArrayExtra("MIN_TEMPS")
        val maxTemps = intent.getStringArrayExtra("MAX_TEMPS")

        val detailsText = StringBuilder()
        detailsText.append("Min Temps:\n")
        minTemps?.forEachIndexed { index, temp ->
            detailsText.append("Day ${index + 1}: ${temp}°C\n")
        }
        detailsText.append("\nMax Temps:\n")
        maxTemps?.forEachIndexed { index, temp ->
            detailsText.append("Day ${index + 1}: ${temp}°C\n")
        }

        textViewDetails.text = detailsText.toString()

        buttonBackMain.setOnClickListener {
            onBackPressed()
        }
    }
}

