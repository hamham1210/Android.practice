package com.example.helloworld.ex_4_activiy

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.helloworld.R


class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        val btn = findViewById<Button>(R.id.button_first)
        btn.setOnClickListener {
            val intent = Intent(this, SencondActivity::class.java)
            startActivity(intent)
        }


        // 클릭된 버튼 객체가 무엇인지를 id를 통해 인지하여, 두 가지 다른 인텐트 객체를 생성
        //각각의 버튼에 다른 메시지(인텐트 객체)를 주어서 다른 동작을 하게 하지만 하나의 함수로 작동 가능


        fun doOnBtnClick(view: View) {
            when (view.getId()) {
                R.id.button_dal -> {
                    val call_intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:114"))
                    startActivity(call_intent)
                }

                R.id.button_map -> {
                    val map_intent =
                        Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.565350, 127.01445"))
                    startActivity(map_intent)
                }
            }
        }
        val btn_call3 = findViewById<Button>(R.id.button3)
        btn_call3.setOnClickListener {
            val edit_text = findViewById<EditText>(R.id.edit_text)
            val strData = edit_text.text.toString()
            val intent = Intent(this, ThridActivity::class.java)
            intent.putExtra("dataFromFirstActivity",strData)
            //위의 네임(dataFromFirstActivity)이 키값이 된다.
            startActivity(intent)
        }
    }
}



