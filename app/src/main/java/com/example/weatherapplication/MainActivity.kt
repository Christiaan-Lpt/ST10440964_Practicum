package com.example.weatherapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextMinDay1: EditText
    private lateinit var editTextMaxDay1: EditText
    private lateinit var editTextMinDay2: EditText
    private lateinit var editTextMaxDay2: EditText
    private lateinit var editTextMinDay3: EditText
    private lateinit var editTextMaxDay3: EditText
    private lateinit var editTextMinDay4: EditText
    private lateinit var editTextMaxDay4: EditText
    private lateinit var editTextMinDay5: EditText
    private lateinit var editTextMaxDay5: EditText
    private lateinit var editTextMinDay6: EditText
    private lateinit var editTextMaxDay6: EditText
    private lateinit var editTextMinDay7: EditText
    private lateinit var editTextMaxDay7: EditText
    private lateinit var textViewAverage: TextView
    private lateinit var buttonCalculate: Button
    private lateinit var buttonClear: Button
    private lateinit var buttonExit: Button
    private lateinit var buttonDetails: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, DetailScreen::class.java)
        intent.putExtra("MIN_TEMPS", arrayOf(
            editTextMinDay1.text.toString(),
            editTextMinDay2.text.toString(),
            editTextMinDay3.text.toString(),
            editTextMinDay4.text.toString(),
            editTextMinDay5.text.toString(),
            editTextMinDay6.text.toString(),
            editTextMinDay7.text.toString()
        ))
        intent.putExtra("MAX_TEMPS", arrayOf(
            editTextMaxDay1.text.toString(),
            editTextMaxDay2.text.toString(),
            editTextMaxDay3.text.toString(),
            editTextMaxDay4.text.toString(),
            editTextMaxDay5.text.toString(),
            editTextMaxDay6.text.toString(),
            editTextMaxDay7.text.toString()
        ))
        startActivity(intent)

        // Initialize EditTexts
        editTextMinDay1 = findViewById(R.id.editTextMinDay1)
        editTextMaxDay1 = findViewById(R.id.editTextMaxDay1)
        editTextMinDay2 = findViewById(R.id.editTextMinDay2)
        editTextMaxDay2 = findViewById(R.id.editTextMaxDay2)
        editTextMinDay3 = findViewById(R.id.editTextMinDay3)
        editTextMaxDay3 = findViewById(R.id.editTextMaxDay3)
        editTextMinDay4 = findViewById(R.id.editTextMinDay4)
        editTextMaxDay4 = findViewById(R.id.editTextMaxDay4)
        editTextMinDay5 = findViewById(R.id.editTextMinDay5)
        editTextMaxDay5 = findViewById(R.id.editTextMaxDay5)
        editTextMinDay6 = findViewById(R.id.editTextMinDay6)
        editTextMaxDay6 = findViewById(R.id.editTextMaxDay6)
        editTextMinDay7 = findViewById(R.id.editTextMinDay7)
        editTextMaxDay7 = findViewById(R.id.editTextMaxDay7)

        // Initialize TextView
        textViewAverage = findViewById(R.id.textViewAverage)

        // Initialize Buttons
        buttonCalculate = findViewById(R.id.buttonCalculate)
        buttonClear = findViewById(R.id.buttonClear)
        buttonExit = findViewById(R.id.buttonExitMain)
        buttonDetails = findViewById(R.id.buttonDetails)

        buttonCalculate.setOnClickListener { calculateAverageTemperature() }
        buttonClear.setOnClickListener { clearInputs() }
        buttonExit.setOnClickListener { finish() }
        buttonDetails.setOnClickListener { navigateToDetails() }
    }

    @SuppressLint("SetTextI18n")
    private fun calculateAverageTemperature() {
        try {
            val minTemps = listOf(
                editTextMinDay1.text.toString().toDouble(),
                editTextMinDay2.text.toString().toDouble(),
                editTextMinDay3.text.toString().toDouble(),
                editTextMinDay4.text.toString().toDouble(),
                editTextMinDay5.text.toString().toDouble(),
                editTextMinDay6.text.toString().toDouble(),
                editTextMinDay7.text.toString().toDouble()
            )

            val maxTemps = listOf(
                editTextMaxDay1.text.toString().toDouble(),
                editTextMaxDay2.text.toString().toDouble(),
                editTextMaxDay3.text.toString().toDouble(),
                editTextMaxDay4.text.toString().toDouble(),
                editTextMaxDay5.text.toString().toDouble(),
                editTextMaxDay6.text.toString().toDouble(),
                editTextMaxDay7.text.toString().toDouble()
            )

            val averageMinTemp = minTemps.average()
            val averageMaxTemp = maxTemps.average()

            textViewAverage.text = getString(R.string.ViewAvg) + "\nMin: %.2f°C, Max: %.2f°C".format(averageMinTemp, averageMaxTemp)
        } catch (e: NumberFormatException) {
            Toast.makeText(this, "Please enter valid temperatures", Toast.LENGTH_SHORT).show()
        }
    }

    private fun clearInputs() {
        editTextMinDay1.text.clear()
        editTextMaxDay1.text.clear()
        editTextMinDay2.text.clear()
        editTextMaxDay2.text.clear()
        editTextMinDay3.text.clear()
        editTextMaxDay3.text.clear()
        editTextMinDay4.text.clear()
        editTextMaxDay4.text.clear()
        editTextMinDay5.text.clear()
        editTextMaxDay5.text.clear()
        editTextMinDay6.text.clear()
        editTextMaxDay6.text.clear()
        editTextMinDay7.text.clear()
        editTextMaxDay7.text.clear()

        textViewAverage.text = getString(R.string.ViewAvg)
    }

    private fun navigateToDetails() {
        val intent = Intent(this, DetailScreen::class.java)
        startActivity(intent)
    }
}
