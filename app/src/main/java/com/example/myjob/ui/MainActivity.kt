package com.example.myjob.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.myjob.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configureBottomNavBar()
    }

    private fun configureBottomNavBar(){

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavView)
        val navController = findNavController(R.id.fragNavHost)
        bottomNavigationView.setupWithNavController(navController)
    }

}