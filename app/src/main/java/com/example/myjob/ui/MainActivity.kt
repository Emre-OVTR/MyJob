package com.example.myjob.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myjob.R
import com.example.myjob.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = activityMainBinding.root
        setContentView(rootView)
        configureBottomNavBar()
    }

    private fun configureBottomNavBar(){

        val navController = findNavController(R.id.fragNavHost)
        activityMainBinding.bottomNavView.setupWithNavController(navController)
    }

}