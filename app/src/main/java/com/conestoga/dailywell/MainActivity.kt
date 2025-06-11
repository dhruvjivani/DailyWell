package com.conestoga.dailywell

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val habitsButton: Button = findViewById(R.id.btnHabits)
        val feedbackButton: Button = findViewById(R.id.btnFeedback)

        habitsButton.setOnClickListener {
            startActivity(Intent(this, HabitsLogActivity::class.java))
        }
        feedbackButton.setOnClickListener {
            startActivity(Intent(this, FeedbackActivity::class.java))
        }
    }
}