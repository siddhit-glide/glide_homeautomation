package com.example.home_automation_glide

import android.os.Bundle
import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.home_automation_glide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)

        binding.buttonLivingRoom.setOnClickListener {
            val intent = Intent (this, LivingRoomActivity::class.java)
            startActivity(intent)
        }

        binding.buttonBedroom1.setOnClickListener {
            val intent = Intent (this, Bedroom1Activity::class.java)
            startActivity(intent)
        }

        binding.buttonBedroom2.setOnClickListener {
            val intent = Intent (this, Bedroom2Activity::class.java)
            startActivity(intent)
        }

        binding.buttonKitchen.setOnClickListener {
            val intent = Intent (this, KitchenActivity::class.java)
            startActivity(intent)
        }

        binding.buttonLivingRoom.setOnClickListener {
            val intent = Intent (this, LivingRoomActivity::class.java)
            startActivity(intent)
        }

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}