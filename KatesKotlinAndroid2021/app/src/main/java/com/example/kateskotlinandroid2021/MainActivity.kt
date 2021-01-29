package com.example.kateskotlinandroid2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // inside onCreate() and after setContentView
        val KButton: Button = findViewById(R.id.btn)
        KButton.setOnClickListener{ afterClick()}

    }

    private fun afterClick() {
        Toast.makeText(this, "Welcome to 2021, Dear Kate!",
            Toast.LENGTH_SHORT).show()
    }
}