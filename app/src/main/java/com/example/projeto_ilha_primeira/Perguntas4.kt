package com.example.projeto_ilha_primeira

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Perguntas4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas4)

        // Botão para ir para a próxima página: Perguntas5
        val nextButton = findViewById<Button>(R.id.btnNext)
        nextButton.setOnClickListener {
            val intent = Intent(this, Perguntas5::class.java)
            startActivity(intent)
        }

        // Botão para voltar para Perguntas3
        val backButton = findViewById<Button>(R.id.btnPrevious)
        backButton.setOnClickListener {
            val intent = Intent(this, Perguntas2::class.java)
            startActivity(intent)
            finish() // Encerra Perguntas3 para não ficar na pilha
        }
    }
}
