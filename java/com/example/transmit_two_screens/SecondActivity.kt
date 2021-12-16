package com.example.transmit_two_screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.transmit_two_screens.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivitySecondBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        showText()
    }
    private fun showText(){
        val bundle: Bundle? = intent.extras
        val message = bundle!!.getString("text1String")
        bindingClass.text2.text = intent.getStringExtra("text1String")
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}