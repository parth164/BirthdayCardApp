package com.example.birthdaycardapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CreateBirthdayCard(view:  View) {
        val name= NameInput.editableText.toString()
        val intent =Intent(this, BirthdayGreet::class.java)
        intent.putExtra(BirthdayGreet.NAMEEXTRA,name)
        startActivity(intent)

       // Toast.makeText(this, "Name is $name", Toast.LENGTH_LONG).show()
    }
}