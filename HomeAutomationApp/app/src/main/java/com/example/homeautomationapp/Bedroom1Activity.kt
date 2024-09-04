package com.example.homeautomationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homeautomationapp.databinding.ActivityBedroom1Binding
import com.example.homeautomationapp.databinding.ActivityLivingRoomBinding

class Bedroom1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityBedroom1Binding
    private var isLight1On = false
    private var isLight2On = false
    private var isFanOn = false
    private var areCurtainsOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bedroom1)

        binding = ActivityBedroom1Binding.inflate(layoutInflater)
        // Set up button listeners for Light 1
        binding.buttonLight1.setOnClickListener {
            isLight1On = !isLight1On
            binding.buttonLight1.text = "Light 1: ${if (isLight1On) "ON" else "OFF"}"
            // Add logic to actually turn on/off Light 1 (e.g., send a command to the smart device)
        }

        // Set up button listeners for Light 2
        binding.buttonLight2.setOnClickListener {
            isLight2On = !isLight2On
            binding.buttonLight2.text = "Light 2: ${if (isLight2On) "ON" else "OFF"}"
            // Add logic to actually turn on/off Light 2 (e.g., send a command to the smart device)
        }

        // Set up button listeners for Fan
        binding.buttonFan.setOnClickListener {
            isFanOn = !isFanOn
            binding.buttonFan.text = "Fan: ${if (isFanOn) "ON" else "OFF"}"
            // Add logic to actually turn on/off the Fan (e.g., send a command to the smart device)
        }

        // Set up button listeners for Curtains
        binding.buttonCurtains.setOnClickListener {
            areCurtainsOpen = !areCurtainsOpen
            binding.buttonCurtains.text = "Curtains: ${if (areCurtainsOpen) "Open" else "Closed"}"
            // Add logic to actually open/close the curtains (e.g., send a command to the smart device)
        }

        // Update sensor data (this is just an example, actual implementation would involve sensor APIs)
        updateSensorData()
    }

    private fun updateSensorData() {
        // Example sensor data update
        binding.textViewTemperature.text = "Temperature: 22°C"
        binding.textViewMotion.text = "Motion: Not Detected"
        binding.textViewHumidity.text = "Humidity: 45%"
        binding.textViewLight.text = "Light Level: Moderate"
    }
}
