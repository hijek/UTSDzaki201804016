package com.Dzaki.UTS201804016


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val bestm : Button = findViewById(R.id.btn_bestm)
        bestm.setOnClickListener{
            val intent = Intent(this,
                BestMouseActivity::class.java)
            startActivity(intent)
        }

        val bestk : Button = findViewById(R.id.btn_bestk)
        bestk.setOnClickListener{
            val intent = Intent(this, BestKeyboardActivity::class.java)
            startActivity(intent)
        }

        val web : Button = findViewById(R.id.btn_web)
        web.setOnClickListener{
            val intent = Intent(this, WebActivity::class.java)
            startActivity(intent)
        }

        val keyb : Button = findViewById(R.id.btn_keyboard)
        keyb.setOnClickListener{
            val intent = Intent(this, KeyboardActivity::class.java)
            startActivity(intent)
        }

        val ms : Button = findViewById(R.id.btn_mouse)
        ms.setOnClickListener{
            val intent = Intent(this, MouseActivity::class.java)
            startActivity(intent)
        }


    }
}