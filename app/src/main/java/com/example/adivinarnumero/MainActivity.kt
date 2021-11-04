package com.example.adivinarnumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numeroAleatorio : Int = 0
        button2.isEnabled = false

        button.setOnClickListener {
            numeroAleatorio = (1..100).random()
            textView.text = "Enter Number Between 1 AND 100"
            button2.isEnabled = true
        }

        button2.setOnClickListener {
            val valorEntrada : Int = editTextNumber.text.toString().toInt()
            if (valorEntrada == numeroAleatorio) {
                textView.text = "¡ENHORABUENA, LO HAS ADIVINADO!"
                button2.isEnabled = false
            }
            if (valorEntrada < numeroAleatorio)
                textView.text = "¡Su numero es menor!"
            if (valorEntrada > numeroAleatorio)
                textView.text = "¡Su numero es mayor!"
        }
    }
}