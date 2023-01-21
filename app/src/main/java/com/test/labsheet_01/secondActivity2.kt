package com.test.labsheet_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val reply=findViewById<TextView>(R.id.textView)
        val name=intent.extras?.getString("name")
        val email=intent.extras?.getString("email")
        reply.text="Hi ${name},\n your Email:${email}\n is registered successfully."
    }
}