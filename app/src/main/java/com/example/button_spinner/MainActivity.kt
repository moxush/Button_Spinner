package com.example.button_spinner

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize Spinner and Button
        val spinner: Spinner = findViewById(R.id.spinner)
        val button: Button = findViewById(R.id.button)

        // Create a list of items for the Spinner
        val items = listOf("Option 1", "Option 2", "Option 3")

        // Create an ArrayAdapter using the items list
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // Set Spinner's OnItemSelectedListener
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: android.view.View?, position: Int, id: Long) {
                // Optionally handle item selection
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Optionally handle no item selected
            }
        }

        // Set Button's OnClickListener
        button.setOnClickListener {
            val selectedOption = spinner.selectedItem.toString()
            Toast.makeText(this, "Selected: $selectedOption", Toast.LENGTH_SHORT).show()
        }
    }
}
