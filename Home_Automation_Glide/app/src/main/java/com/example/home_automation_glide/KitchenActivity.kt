package com.example.home_automation_glide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.home_automation_glide.databinding.ActivityKitchenBinding

class KitchenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKitchenBinding
    private var isLight1On = false
    private var isFanOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityKitchenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLight.setOnClickListener {
            isLight1On = !isLight1On
            binding.buttonLight.text = "Light: ${if (isLight1On) "ON" else "OFF"}"
        }

        binding.buttonFan.setOnClickListener {
            isFanOn = !isFanOn
            binding.buttonFan.text = "Fan: ${if (isFanOn) "ON" else "OFF"}"
        }

        updateSensorData()
    }

    private fun updateSensorData() {
        binding.textViewTemperature.text = "Temperature: 22°C"
        binding.textViewMotion.text = "Motion: Not Detected"
        binding.textViewHumidity.text = "Humidity: 50%"
        binding.textViewLight.text = "Light Level: High"
    }
}
