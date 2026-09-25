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

        // 1

        val btnexec1 = findViewById<Button>(R.id.btnexec1)
        val edtexec1 = findViewById<EditText>(R.id.edtexec1)
        val txtexec1 = findViewById<TextView>(R.id.txtexec1)
        btnexec1.setOnClickListener {
            var numero = edtexec1.text.toString().toInt() * 2
            txtexec1.text = numero.toString()
        }

        //2

        val btnexec2 = findViewById<Button>(R.id.btnexec2)
        val edtexec2 = findViewById<EditText>(R.id.edtexec2)
        val txtexec2 = findViewById<TextView>(R.id.txtexec2)
        btnexec2.setOnClickListener {
            val idade = edtexec2.text.toString().toInt()
            val dias = idade * 365

            txtexec2.text = "Você ja vivel aproximadamente  $dias dias"
        }

        //3

        val btnexec3 = findViewById<Button>(R.id.btnexec3)
        val edtexec3 = findViewById<EditText>(R.id.edtexec3)
        val txtexec3 = findViewById<TextView>(R.id.txtexec3)
        btnexec3.setOnClickListener {
            val valorconta = edtexec3.text.toString().toInt()
            val gorjeta = valorconta * 0.10

            txtexec3.text = String.format(  "R$ %.2f",gorjeta)
        }

        //4

        val btnexec4 = findViewById<Button>(R.id.btnexec4)
        val edtexec4 = findViewById<EditText>(R.id.edtexec4)
        val txtexec4 = findViewById<TextView>(R.id.txtexec4)
        btnexec4.setOnClickListener {
            val dolar = edtexec4.text.toString().toInt()
            val cotacao = 5.50

            val real = dolar * cotacao

            txtexec4.text = String.format("R$ %.2f", real)
        }

        // 5

        val btnexec5 = findViewById<Button>(R.id.btnexec5)
        val nota1exec5 = findViewById<EditText>(R.id.nota1exec5)
        val nota2exec5 = findViewById<EditText>(R.id.nota2exec5)
        val txtexec5 = findViewById<TextView>(R.id.txtexec5)

        btnexec5.setOnClickListener {
            val nota1 = nota1exec5.text.toString().toDouble()
            val nota2 = nota2exec5.text.toString().toDouble()
            val media = (nota1 + nota2) / 2

            txtexec5.text = String.format("Média: %.2f", media)
        }

        // 6

        val edtexec6 =
            findViewById<EditText>(R.id.edtexec6)

        val btnexec6 =
            findViewById<Button>(R.id.btnexec6)

        val txtexec6 =
            findViewById<TextView>(R.id.txtexec6)

        btnexec6.setOnClickListener {

            val idade =
                edtexec6.text.toString().toInt()

            val categoria: String

            if (idade < 12) {

                categoria = "Criança"

            } else if (idade <= 17) {

                categoria = "Adolescente"

            } else if (idade <= 59) {

                categoria = "Adulto"

            } else {

                categoria = "Idoso"
            }

            txtexec6.text = categoria
        }

        // 7

        val edtexec7 =
            findViewById<EditText>(R.id.edtexec7)

        val btnexec7 =
            findViewById<Button>(R.id.btnexec7)

        val txtexec7 =
            findViewById<TextView>(R.id.txtexec7)

        btnexec7.setOnClickListener {

            val valorCompra =
                edtexec7.text.toString().toDouble()

            val percentualDesconto: Double

            if (valorCompra < 100) {

                percentualDesconto = 0.0

            } else if (valorCompra < 300) {

                percentualDesconto = 5.0

            } else if (valorCompra < 500) {

                percentualDesconto = 10.0

            } else {

                percentualDesconto = 15.0
            }

            val desconto =
                valorCompra * (percentualDesconto / 100)

            val valorFinal =
                valorCompra - desconto

            txtexec7.text =
                String.format(
                    "Desconto: %.0f%%\nValor final: R$ %.2f",
                    percentualDesconto,
                    valorFinal
                )
        }
    }
}