package com.example.weatherapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonCalculate: Button
    private lateinit var buttonClear: Button
    private lateinit var buttonDetails: Button
    private lateinit var buttonExitMain: Button

    private lateinit var minTempDay1: EditText
    private lateinit var maxTempDay1: EditText
    private lateinit var condDay1: EditText

    private lateinit var minTempDay2: EditText
    private lateinit var maxTempDay2: EditText
    private lateinit var condDay2: EditText

    // Declare EditText variables for other days as needed

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize buttons
        buttonCalculate = findViewById(R.id.buttonCalculate)
        buttonClear = findViewById(R.id.buttonClear)
        buttonDetails = findViewById(R.id.buttonDetails)
        buttonExitMain = findViewById(R.id.buttonExitMain)

        // Initialize EditTexts for Day 1
        minTempDay1 = findViewById(R.id.editTextMinDay1)
        maxTempDay1 = findViewById(R.id.editTextMaxDay1)
        condDay1 = findViewById(R.id.editTextCondDay1)

        // Initialize EditTexts for Day 2
        minTempDay2 = findViewById(R.id.editTextMinDay2)
        maxTempDay2 = findViewById(R.id.editTextMaxDay2)
        condDay2 = findViewById(R.id.editTextCondDay2)

        // Set click listeners for buttons
        buttonCalculate.setOnClickListener {
            // Handle calculate button click
            calculateAverage()
        }

        buttonClear.setOnClickListener {
            // Handle clear button click
            clearData()
        }

        buttonDetails.setOnClickListener {
            // Handle details button click
            viewDetails()
        }

        buttonExitMain.setOnClickListener {
            // Handle exit button click
            finish()
        }
    }

    private fun calculateAverage() {
        // Calculate average temperature
        // Implement your logic here
    }

    private fun clearData() {
        // Clear all EditText fields
        minTempDay1.text.clear()
        maxTempDay1.text.clear()
        condDay1.text.clear()

        minTempDay2.text.clear()
        maxTempDay2.text.clear()
        condDay2.text.clear()

        // Clear EditTexts for other days as needed
    }

    private fun viewDetails() {
        // View detailed weather forecast
        // Implement your logic here
    }
}
