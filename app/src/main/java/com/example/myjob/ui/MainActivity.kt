package com.example.myjob.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
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
        setSupportActionBar(activityMainBinding.myToolbar)
        configureViews()
    }

    private fun configureViews(){

        val navController = findNavController(R.id.fragNavHost)
        activityMainBinding.bottomNavView.setupWithNavController(navController)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.list_fragment, R.id.map_fragment, R.id.add_job_fragment))
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragNavHost) as NavHostFragment
        setupActionBarWithNavController(navHostFragment.navController, appBarConfiguration)
    }

}