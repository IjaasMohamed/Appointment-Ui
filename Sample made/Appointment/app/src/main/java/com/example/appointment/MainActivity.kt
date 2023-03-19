package com.example.appointment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appointment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater )
        setContentView(binding.root)
    //init ui
        initUI()

    }

    private fun initUI() {
    binding.fabBack.setOnClickListener(){



    }
        binding.btnSignIn.setOnClickListener(){


        }
        binding.tvForgotPassword.setOnClickListener(){

        }
        binding.tvSignUp.setOnClickListener(){

        }
    }
}