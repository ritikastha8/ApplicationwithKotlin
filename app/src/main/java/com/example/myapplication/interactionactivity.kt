package com.example.myapplication

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class interactionactivity : AppCompatActivity(){
    lateinit var btntoast :Button
    lateinit var btnsnack :Button
    lateinit var btnalert :Button
    lateinit var main: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interactionactivity)

        main = findViewById(R.id.lstView)
        btntoast = findViewById(R.id.btnToast)
        btnsnack = findViewById(R.id.btnSnack)
        btnalert = findViewById(R.id.btnAlert )


        btntoast.setOnClickListener {
            Toast.makeText(this@interactionactivity,"Login Success",Toast.LENGTH_LONG).show()

        }
        btnsnack.setOnClickListener{
            Snackbar.make(main,"Invalid Login",Snackbar.LENGTH_LONG).setAction("close",{}).show()
        }
        btnalert.setOnClickListener{
            var alert= AlertDialog.Builder(this@interactionactivity)
            alert.setTitle("Confirmation")
                .setMessage("Are you sure?")
                .setIcon(R.drawable.lion)
                .setNegativeButton("No",
                    DialogInterface.OnClickListener {
                            dialog, which ->
                        dialog.dismiss()

                    })
                .setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->  })


            alert.create().show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.lstView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
