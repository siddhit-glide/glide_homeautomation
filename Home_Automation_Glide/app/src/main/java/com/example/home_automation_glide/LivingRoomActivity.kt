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
        setContentView(binding.root)

        binding.buttonLight1.setOnClickListener {
            isLight1On = !isLight1On
            binding.buttonLight1.text = "Light 1: ${if (isLight1On) "ON" else "OFF"}"
        }

        binding.buttonLight2.setOnClickListener {
            isLight2On = !isLight2On
            binding.buttonLight2.text = "Light 2: ${if (isLight2On) "ON" else "OFF"}"
        }

        binding.buttonLight3.setOnClickListener {
            isLight3On = !isLight3On
            binding.buttonLight3.text = "Light 3: ${if (isLight3On) "ON" else "OFF"}"
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
        binding.textViewMotion.text = "Motion: Detected"
        binding.textViewHumidity.text = "Humidity: 45%"
        binding.textViewLight.text = "Light Level: Moderate"
    }
}
