package com.example.belajarandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.example.belajarandroid.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val username = binding.usernameLayout.editText?.text.toString()
            val password = binding.passwordLayout.editText?.text.toString()

            try {

                if (username == "admin" && password == "123") {

                    val intent = Intent(this, TugasActivity::class.java)
                    startActivity(intent)
                } else {

                    throw Exception("Kombinasi username dan password salah")
                }
            } catch (e: Exception) {

                e.printStackTrace()
                showToast("Terjadi kesalahan: ${e.message}")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

