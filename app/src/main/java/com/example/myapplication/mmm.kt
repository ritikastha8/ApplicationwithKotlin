package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mmm : AppCompatActivity() {
//    lateinit var TT1: TextView
//    lateinit var TT2: TextView
//    lateinit var EE1: EditText
//    lateinit var EE2: EditText
//    lateinit var EE3: EditText
//    lateinit var EE4: EditText
//
//    lateinit var BB1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mmm)
//        TT1 =findViewById(R.id.T1)
//        TT2 =findViewById(R.id.T2)
//        EE1 =findViewById(R.id.E1)
//        EE2 =findViewById(R.id.E2)
//        EE3 =findViewById(R.id.E3)
//        EE4 =findViewById(R.id.E4)
//        BB1 =findViewById(R.id.B1)
//        EE4.setOnClickListener{
//
//        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.lstView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}