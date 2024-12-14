package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityButtonBinding

class ButtonActivity : AppCompatActivity() {
    //code
    lateinit var binding: ActivityButtonBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
            //code
        binding = ActivityButtonBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_button)

        setContentView(binding.root)
//button
        binding.btnNavigate.setOnClickListener {

            //code variable deko username1 and password
            // code ; name and password chahi agi palatte ma deko id (button kt ko xml ma)
            val username1: String = binding.name.text.toString()
            val password: String = binding.password.text.toString()


            if (username1.isEmpty()){
                binding.name.error = "Username can't be empty"
            }else if(password.isEmpty()){
                binding.password.error = "Password can't be empty"
            }else {
                //code ar
                var intent = Intent(this@ButtonActivity, destinationActivity::class.java)
                intent.putExtra("username", username1)
                intent.putExtra("password", password)
                startActivity(intent)

                }




            // not written by ourself




            }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.logoimage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}