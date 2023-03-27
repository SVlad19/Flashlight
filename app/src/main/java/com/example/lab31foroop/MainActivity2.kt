package com.example.lab31foroop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab31foroop.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding2: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding2 = ActivityMainBinding.inflate(layoutInflater)
        val view = binding2.root

        setContentView(view)

        val color = intent.getStringExtra("Color")



    }
}