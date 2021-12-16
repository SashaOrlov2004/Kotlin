package com.example.transmit_two_screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.transmit_two_screens.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)




    }
    fun transmit(view: View){
        val text1String: String = bindingClass.text1.text.toString()
        val transmitText = Intent(this, SecondActivity::class.java)
        transmitText.putExtra("text1String", text1String)
        startActivity(transmitText)



    }
}