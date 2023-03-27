package com.example.lab31foroop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lab31foroop.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val intent = Intent(this,MainActivity2::class.java)
        val view = binding.root

        setContentView(view)

        binding.btnBlack.setOnClickListener(){
            Log.d("MyLog","We are here")
            intent.putExtra("Color","black")
            startActivity(intent)
        }
        binding.btnBlue.setOnClickListener(){
            intent.putExtra("Color","blue")
            startActivity(intent)
        }

        binding.btnCian.setOnClickListener(){
            intent.putExtra("Color","cyan")
            startActivity(intent)
        }

        binding.btnGreen.setOnClickListener(){
            intent.putExtra("Color","green")
            startActivity(intent)
        }

        binding.btnLightGray.setOnClickListener(){
            intent.putExtra("Color","lightGray")
            startActivity(intent)
        }

        binding.btnMagenta.setOnClickListener(){
            intent.putExtra("Color","magneta")
            startActivity(intent)
        }

        binding.btnRed.setOnClickListener(){
            intent.putExtra("Color","red")
            startActivity(intent)
        }

        binding.btnWhite.setOnClickListener(){
            intent.putExtra("Color","white")
            startActivity(intent)
        }


    }
}