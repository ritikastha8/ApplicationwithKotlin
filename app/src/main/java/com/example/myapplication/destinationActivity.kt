package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityDestinationBinding

class destinationActivity : AppCompatActivity() {
    // c ode
    lateinit var binding : ActivityDestinationBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //code
        binding = ActivityDestinationBinding.inflate(layoutInflater)
        setContentView(binding.root)
            //CODE
        val username : String = intent.getStringExtra("username").toString()
        val password : String = intent.getStringExtra("password").toString()
        //code (arko page ma name ra password aune j type gareko xa)//destination  ma rakheko id lekhne
        binding.OutputUsername.text= username
        binding.OutputPassword.text = password


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.logoimage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
