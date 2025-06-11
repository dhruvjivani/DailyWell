package com.conestoga.dailywell

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FeedbackActivity : AppCompatActivity() {

    private lateinit var nameInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var feedbackInput: EditText
    private lateinit var submitBtn: Button
    private lateinit var resetBtn: Button
    private lateinit var backBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        nameInput = findViewById(R.id.inputName)
        emailInput = findViewById(R.id.inputEmail)
        feedbackInput = findViewById(R.id.inputFeedback)
        submitBtn = findViewById(R.id.btnSubmit)
        resetBtn = findViewById(R.id.btnReset)
        backBtn = findViewById(R.id.btnBack)

        submitBtn.setOnClickListener { handleSubmit() }
        resetBtn.setOnClickListener { resetForm() }
        backBtn.setOnClickListener { finish() }
    }

    private fun handleSubmit() {
        val name = nameInput.text.toString()
        val email = emailInput.text.toString()
        val feedback = feedbackInput.text.toString()

        when {
            name.isBlank() -> showToast(getString(R.string.error_name))
            !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> showToast(getString(R.string.error_email))
            feedback.isBlank() -> showToast(getString(R.string.error_feedback))
            else -> showToast(getString(R.string.success_message))
        }
    }

    private fun resetForm() {
        nameInput.setText("")
        emailInput.setText("")
        feedbackInput.setText("")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}