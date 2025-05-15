package com.example.flashcardapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import vcmsa.ci.assigmenttwo.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: =findViewById(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, Question1Activity::class.java)
            startActivity(intent)
        }
    }
}
