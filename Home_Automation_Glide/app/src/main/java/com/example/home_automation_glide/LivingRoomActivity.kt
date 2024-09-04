package com.example.home_automation_glide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.home_automation_glide.databinding.ActivityLivingroomBinding

class LivingRoomActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLivingroomBinding
    private var isLight1On = false
    private var isLight2On = false
    private var isLight3On = false
    private var isFanOn = false
    private var areCurtainsOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLivingroomBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_livingroom)

        // Set up button listeners
        binding.buttonLight1.setOnClickListener {
            isLight1On = !isLight1On
            binding.buttonLight1.text = "Light 1: ${if (isLight1On) "ON" else "OFF"}"
            // Add logic to actually turn on/off Light 1
        }

        binding.buttonLight2.setOnClickListener {
            isLight2On = !isLight2On
            binding.buttonLight2.text = "Light 2: ${if (isLight2On) "ON" else "OFF"}"
            // Add logic to actually turn on/off Light 2
        }

        binding.buttonLight3.setOnClickListener {
            isLight3On = !isLight3On
            binding.buttonLight3.text = "Light 3: ${if (isLight3On) "ON" else "OFF"}"
            // Add logic to actually turn on/off Light 3
        }

        binding.buttonFan.setOnClickListener {
            isFanOn = !isFanOn
            binding.buttonFan.text = "Fan: ${if (isFanOn) "ON" else "OFF"}"
            // Add logic to actually turn on/off the Fan
        }

        binding.buttonCurtains.setOnClickListener {
            areCurtainsOpen = !areCurtainsOpen
            binding.buttonCurtains.text = "Curtains: ${if (areCurtainsOpen) "Open" else "Closed"}"
            // Add logic to actually open/close the Curtains
        }

        // Update sensor data (this is just an example, actual implementation would involve sensor APIs)
        updateSensorData()
    }

    private fun updateSensorData() {
        // Example sensor data update
        binding.textViewTemperature.text = "Temperature: 22°C"
        binding.textViewMotion.text = "Motion: Detected"
        binding.textViewHumidity.text = "Humidity: 45%"
        binding.textViewLight.text = "Light Level: Moderate"
    }
}
