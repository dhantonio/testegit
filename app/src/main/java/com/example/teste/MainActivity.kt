package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, R.string.welcome, Toast.LENGTH_SHORT).show()
    }

    fun button1(view: View) {

        var edit1 = findViewById<EditText>(R.id.editTExtTextPersonName)
        Toast.makeText(this, edit1.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.textView6).setText(edit1.text)
    }

    fun button2(view: View) {
        Toast.makeText(this, "button2", Toast.LENGTH_LONG).show()
    }
}



