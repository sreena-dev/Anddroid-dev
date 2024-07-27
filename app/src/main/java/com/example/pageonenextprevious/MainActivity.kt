package com.example.pageonenextprevious

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val button1=findViewById<Button>(R.id.button1)
        val button2=findViewById<Button>(R.id.button2)

        button1.setOnClickListener{
            Toast.makeText(this, "Yoo! this is the first layout", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener{
                var intent= Intent(this,SecondActivity::class.java)
                startActivity(intent)
        }



    }
}

