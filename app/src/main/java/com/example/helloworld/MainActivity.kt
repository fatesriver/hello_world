package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var mBtnClick:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews(){
        mBtnClick = findViewById(R.id.btn_click)
        mBtnClick.setOnClickListener {
            thisIsClickMethod()
        }
    }

    private fun thisIsClickMethod(){
        Toast.makeText(this,"Hello World",Toast.LENGTH_SHORT).show()
    }
}