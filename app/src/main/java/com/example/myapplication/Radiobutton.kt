package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Radiobutton : AppCompatActivity() {
    lateinit var radioapple: RadioButton
    lateinit var radiowhiteflower : RadioButton
    lateinit var radiolavender : RadioButton
    lateinit var imageViewRadio : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radiobutton)



        radioapple = findViewById(R.id.btnflower)
        radiowhiteflower = findViewById(R.id.btnwhiteflower)
        radiolavender = findViewById(R.id.btnlavender)
        imageViewRadio = findViewById(R.id.btnimageView2)

        radioapple.setOnClickListener {
            imageViewRadio.setImageResource(R.drawable.flower)
        }
        radiowhiteflower.setOnClickListener {
            imageViewRadio.setImageResource(R.drawable.whiteflower)
        }
        radiolavender.setOnClickListener {
            imageViewRadio.setImageResource(R.drawable.lavender)
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}