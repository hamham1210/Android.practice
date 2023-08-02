package com.example.helloworld.ex_4_activiy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.helloworld.R

class SencondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sencond)

        var btn = findViewById<Button>(R.id.button_close)
        btn.setOnClickListener {
            finish()
        }
    }
}