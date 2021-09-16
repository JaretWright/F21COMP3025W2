package com.example.f21comp3025w2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.f21comp3025w2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.passwordEditText.text.toString().equals("12345"))
            {
                Snackbar.make(binding.loginLayout, "Welcome ${binding.nameEditText.text}",Snackbar.LENGTH_INDEFINITE).show()
            }
            else
            {
                Toast.makeText(this, "Invalid Login", Toast.LENGTH_LONG).show()
            }
        }
    }
}