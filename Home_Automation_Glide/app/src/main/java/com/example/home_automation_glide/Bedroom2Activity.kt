package com.example.home_automation_glide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.home_automation_glide.databinding.ActivityBedroom2Binding

class Bedroom2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityBedroom2Binding
    private var isLight1On = false
    private var isFanOn = false
    private var areCurtainsOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBedroom2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLight1.setOnClickListener {
            isLight1On = !isLight1On
            binding.buttonLight1.text = "Light : ${if (isLight1On) "ON" else "OFF"}"
        }

        binding.buttonFan.setOnClickListener {
            isFanOn = !isFanOn
            binding.buttonFan.text = "Fan: ${if (isFanOn) "ON" else "OFF"}"
        }

        binding.buttonCurtains.setOnClickListener {
            areCurtainsOpen = !areCurtainsOpen
            binding.buttonCurtains.text = "Curtains: ${if (areCurtainsOpen) "Open" else "Closed"}"
        }

        updateSensorData()
    }

    private fun updateSensorData() {
        binding.textViewTemperature.text = "Temperature: 22°C"
        binding.textViewMotion.text = "Motion: Not Detected"
        binding.textViewHumidity.text = "Humidity: 45%"
        binding.textViewLight.text = "Light Level: Moderate"
    }
}
