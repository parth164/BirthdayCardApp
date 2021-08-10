package com.example.birthdaycardapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_birthday_greet.*

class BirthdayGreet : AppCompatActivity() {

    companion object
    {
      const val  NAMEEXTRA=""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)
       val name=  intent.getStringExtra(NAMEEXTRA)


        Birthdaygreetings.text=" A very Happy Birthday  \n$name"
    }
}