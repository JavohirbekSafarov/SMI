package com.javohirbekcoder.physicaldevelopmentcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.navigation.findNavController
import com.javohirbekcoder.physicaldevelopmentcheck.fragments.SelectAgeFragment
import com.javohirbekcoder.physicaldevelopmentcheck.fragments.SplashFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}