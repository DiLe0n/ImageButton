package com.example.imagebutton2

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.imagebutton2.R

class MainActivity : AppCompatActivity() {
    private val imageButton: ImageButton by lazy {

        findViewById<ImageButton>(R.id.imageButton)
    }

    private val animales = listOf(
        R.drawable.gato,
        R.drawable.perro,
        R.drawable.elefante
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton.setOnClickListener {
            val indice = animales.random()
            imageButton.setImageResource(indice)
        }
    }
}