package com.example.taranvir.plantquiz.Controller

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.example.taranvir.plantquiz.R

class SplashActivity : AppCompatActivity() {

    private val SPLASH_SCREEN_TIMEOUT:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_main)
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, SPLASH_SCREEN_TIMEOUT)
    }
}