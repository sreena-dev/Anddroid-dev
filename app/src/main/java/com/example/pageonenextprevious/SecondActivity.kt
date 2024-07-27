package com.example.pageonenextprevious

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.pageonenextprevious.ui.theme.LoginActivity

class SecondActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)

        val Layout2button2= findViewById<Button>(R.id.Layout2button2)
        val Layout2button1=findViewById<Button>(R.id.Layout2button1)

        Layout2button1.setOnClickListener{
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        Layout2button2.setOnClickListener{
            var intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

//        Layout2button2.setOnClickListener{
//            Toast.makeText(this, "Yoo! this is the last layout", Toast.LENGTH_SHORT).show()
//        }
    }
}

