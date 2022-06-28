package com.example.login_signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button_get_started)
        button.setOnClickListener { setContentView(R.layout.activity_login) }



    }

    private fun toast() {
        val textview : TextView = findViewById(R.id.textView2)
        val resultText = textview.text.toString()
        Toast.makeText(this, resultText, Toast.LENGTH_LONG).show()
    }
}