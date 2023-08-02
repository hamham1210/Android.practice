package com.example.helloworld.ex_4_activiy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.helloworld.R

class ThridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thrid)

        val strData = intent.getStringExtra("dataFormFirstActivity")
        val editText = findViewById<EditText>(R.id.edit_text)
        editText.setText(strData)

        val btn_close = findViewById<Button>(R.id.button_close)
        btn_close.setOnClickListener{
            finish()
        }
    }
}