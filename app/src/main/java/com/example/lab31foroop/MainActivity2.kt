package com.example.lab31foroop

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab31foroop.databinding.ActivityMain2Binding
import com.example.lab31foroop.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val color = intent.getStringExtra("Color")

        when(color){
            "black"-> binding.CLMain2.setBackgroundColor(Color.BLACK)
            "blue"->binding.CLMain2.setBackgroundColor(Color.BLUE)
            "cyan"->binding.CLMain2.setBackgroundColor(Color.CYAN)
            "green"->binding.CLMain2.setBackgroundColor(Color.GREEN)
            "lightGray"->binding.CLMain2.setBackgroundColor(Color.LTGRAY)
            "magneta"->binding.CLMain2.setBackgroundColor(Color.MAGENTA)
            "red"->binding.CLMain2.setBackgroundColor(Color.RED)
            "white"-> binding.CLMain2.setBackgroundColor(Color.WHITE)

            else -> {
                finish()
            }
        }



    }
}