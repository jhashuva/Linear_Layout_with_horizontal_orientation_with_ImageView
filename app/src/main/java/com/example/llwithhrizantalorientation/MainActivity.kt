package com.example.llwithhrizantalorientation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input:EditText = findViewById(R.id.input)
        val btn:Button = findViewById(R.id.btn)
        var output = findViewById<TextView>(R.id.output)
        var img = findViewById<ImageView>(R.id.greetings)

        btn.setOnClickListener(){
            output.text = "Happy Birthday "+input.text.toString()
            img.setImageResource(R.drawable.greetings)
        }
    }
}