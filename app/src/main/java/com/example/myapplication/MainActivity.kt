package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.myButton)
        val myTextView = findViewById<TextView>(R.id.myTextView)

        myButton.setOnClickListener {
            myTextView.text = "Hello, my name is Tutyanchuk Sergey"
        }
    }

    /*  Method2 for Button listener. Working if only set |android:onClick="myFunc"|
     on Button attribute on activity_main.xml

    fun myFunc(view: View) {
        val myTextView2 = findViewById<TextView>(R.id.myTextView)
        myTextView2.text = "Hello, my name is Tutyanchuk Sergey"
    }
     */

}