package com.example.homeautomationapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homeautomationapp.databinding.ActivityMainBinding
//import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityMainBinding
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.buttonLivingRoom.setOnClickListener {
            val intent = Intent(this, LivingRoomActivity::class.java)
            startActivity(intent)
        }

        binding.buttonBedroom1.setOnClickListener {
            val intent = Intent(this, Bedroom1Activity::class.java)
            startActivity(intent)
        }

        binding.buttonBedroom2.setOnClickListener {
            val intent = Intent(this, Bedroom2Activity::class.java)
            startActivity(intent)
        }

        binding.buttonKitchen.setOnClickListener {
            val intent = Intent(this, KitchenActivity::class.java)
            startActivity(intent)
        }
    }
}
