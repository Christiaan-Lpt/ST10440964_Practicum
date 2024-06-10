package com.example.weatherapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailScreen : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_view_screen)

        val temperatures = intent.getStringArrayExtra("temperatures") ?: arrayOf("", "", "", "", "", "", "")

        val detailsTextView = findViewById<TextView>(R.id.textViewDetails)
        val details = StringBuilder()

        for (i in temperatures.indices) {
            details.append("Day ${i + 1}:\n")
            details.append("Temperature: ${temperatures[i]}\n")
            details.append("Condition: TBD\n\n")  // Placeholder for additional data
        }

        detailsTextView.text = details.toString()

        findViewById<Button>(R.id.buttonBackMain).setOnClickListener {
            finish()
        }
    }
}
