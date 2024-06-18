package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
       ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnImc.setOnClickListener {
            val altura = binding.edtAltura.text.toString().toFloat()
            val peso = binding.edtPeso.text.toString().toFloat()
            val resultado = peso / (altura * altura)

            binding.txtResultado.text = resultado.toString()
        }

    }
}