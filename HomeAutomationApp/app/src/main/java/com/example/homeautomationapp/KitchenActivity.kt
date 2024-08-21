package com.example.homeautomationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homeautomationapp.databinding.ActivityKitchenBinding
class KitchenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKitchenBinding
    private var isLight1On = false

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityKitchenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kitchen)

        // Set up button listeners for Light 1
        binding.buttonLight1.setOnClickListener {
            isLight1On = !isLight1On
            binding.buttonLight1.text = "Light 1: ${if (isLight1On) "ON" else "OFF"}"
            // Add logic to actually turn on/off Light 1 (e.g., send a command to the smart device)
        }

        updateSensorData()
    }

    private fun updateSensorData() {
        // Example sensor data update
        binding.textViewTemperature.text = "Temperature: 22°C"
        binding.textViewMotion.text = "Motion: Not Detected"
        binding.textViewHumidity.text = "Humidity: 50%"
        binding.textViewLight.text = "Light Level: High"
    }
}
