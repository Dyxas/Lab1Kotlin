package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickBut(view: View)
    {
        val textInput : EditText = findViewById(R.id.editTextTextMultiLine)
        val textRead : TextView = findViewById(R.id.textView)

        textRead.text = textInput.editableText;
    }
}