package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityHomeoutputBinding

class HomeoutputActivity : AppCompatActivity() {
    lateinit var bind : ActivityHomeoutputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_homeoutput)

        bind = ActivityHomeoutputBinding.inflate(layoutInflater)
        setContentView(bind.root)
        //CODE
        val username : String = intent.getStringExtra("username").toString()
        val email : String = intent.getStringExtra("email").toString()
        val gender : String = intent.getStringExtra("gender").toString()
        val country : String = intent.getStringExtra("country").toString()
        val city : String = intent.getStringExtra("city").toString()
        //code (arko page ma name ra password aune j type gareko xa)//destination  ma rakheko id lekhne

        bind.outputwelcome.text = username
        bind.outputemail.text = email
        bind.outputgender.text = gender
        bind.outputcountry.text = country
        bind.outputcity.text = city
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.genderoutput)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}