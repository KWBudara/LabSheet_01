package com.test.labsheet_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.database.DatabaseUtilsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etName:EditText
    private lateinit var etEmail:EditText
    private lateinit var btnRegister:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    setContentView(R.layout.activity_main)

        var dataBinding: ActivityMainBinding= DataBindingUtils.setContentview(this,R.layout. activity_main)

        btnRegister.setOnClickListener{

            val name=findViewById<EditText>(R.id.etName)
            val email=findViewById<EditText>(R.id.etEmail)
            if (name.text.isBlank())
                Toast.makeText( this,"Name cannot be empty", Toast.LENGTH_SHORT).show()
            else if (email.text.isBlank())
                Toast.makeText( this,"Email cannot be empty", Toast.LENGTH_SHORT).show()
            else{
                val intent=Intent( this,secondActivity2::class.java)
                intent.putExtra("name", name.text.toString())
                intent.putExtra("Email", name.text.toString())
                startActivity(intent)
            }


        }

        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        btnRegister = findViewById(R.id.btnRegister)
    }

    class DataBindingUtils {

    }

    class ActivityMainBinding {

    }


}