package com.example.pageonenextprevious.ui.theme

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextClock
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.core.widget.addTextChangedListener
import com.example.pageonenextprevious.MainActivity
import com.example.pageonenextprevious.R


class LoginActivity : ComponentActivity() {

    private lateinit var mButton: Button
    private lateinit var mNameText: EditText
    private lateinit var mEditTextPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout3)

//  TYPES OF DECLERATION -> https://medium.com/android-ideas/findviewbyid-in-kotlin-ce4d22193c79

//  text view it remains as such
//        val loginText=findViewById<TextView>(R.id.LoginText)
//        val password=findViewById<TextView>(R.id.password)
//        var mail=findViewById<TextView>(R.id.mail)

//  Remember to create findviewbyid for  late init also
        mButton = findViewById(R.id.button)
        // val button=findViewById<Button>(R.id.button)
        val checkBox=findViewById<CheckBox>(R.id.checkBox)
        mNameText = findViewById(R.id.nameText)
        mEditTextPassword = findViewById(R.id.editTextPassword)


        mNameText.addTextChangedListener { text ->
            Log.d(TAG, "Name entered: $text")
        }

        mEditTextPassword.addTextChangedListener { text ->
            Log.d(TAG, "Password entered: $text")

        }

        mButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
//            Toast.makeText(this, "Yoo! login", Toast.LENGTH_SHORT).show()
        }

        checkBox.setOnClickListener {
            Toast.makeText(this, "Terms and Conditions Checked",Toast.LENGTH_SHORT).show()
        }



    }
}


