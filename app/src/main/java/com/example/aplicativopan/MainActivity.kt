package com.example.aplicativopan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.exercicio_nota)

        val btnexec1 = findViewById<Button>(R.id.btnexec1)
        val edtexec1 = findViewById<EditText>(R.id.edtexec1)
        val txtexec1 = findViewById<TextView>(R.id.txtexec1)
        btnexec1.setOnClickListener {
            var numero = edtexec1.text.toString().toInt() * 2
            txtexec1.text = numero.toString()
        }

        val btnexec2 = findViewById<Button>(R.id.btnexec2)
        val edtexec2 = findViewById<EditText>(R.id.edtexec2)
        val txtexec2 = findViewById<TextView>(R.id.txtexec2)
        btnexec2.setOnClickListener {
            var idade = edtexec2.text.toString().toInt() * 365
            txtexec2.text = "Você ja vivel aproximadamente " + idade.toString() + " Anos de idade"
        }

        val btnexec3 = findViewById<Button>(R.id.btnexec3)
        val edtexec3 = findViewById<EditText>(R.id.edtexec3)
        val txtexec3 = findViewById<TextView>(R.id.txtexec3)
        btnexec2.setOnClickListener {
            var idade = edtexec2.text.toString().toInt() * 0.1
            txtexec2.text = "Você ja vivel aproximadamente " + idade.toString() + " Anos de idade"
        }


    }
}