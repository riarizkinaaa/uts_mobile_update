package com.example.belajarandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.belajarandroid.databinding.ActivityTugasBinding
import com.google.android.material.textfield.TextInputLayout

class TugasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTugasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTugasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Halaman Tugas"

        binding.calculateButton.setOnClickListener {
            val lengthText = binding.lengthLayout.editText?.text.toString()
            val widthText = binding.widthLayout.editText?.text.toString()
            val heightText = binding.heightLayout.editText?.text.toString()

            if (lengthText.isNotEmpty() && widthText.isNotEmpty() && heightText.isNotEmpty()) {
                val length = lengthText.toDouble()
                val width = widthText.toDouble()
                val height = heightText.toDouble()

                val area = length * width * height
                binding.resultTextView.text = "Hasil: $area cm²"
            } else {
                binding.resultTextView.text = "Mohon masukkan semua nilai panjang, lebar, dan tinggi."
            }
        }
    }
}




