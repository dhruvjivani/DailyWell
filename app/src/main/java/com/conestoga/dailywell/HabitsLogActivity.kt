package com.conestoga.dailywell

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HabitsLogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habits_log)

        val backButton: Button = findViewById(R.id.btnBack)
        backButton.setOnClickListener { finish() }
    }
}