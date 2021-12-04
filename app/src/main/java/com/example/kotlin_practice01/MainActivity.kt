package com.example.kotlin_practice01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_practice01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tapHere.setOnClickListener {
            binding.textView.text = "ボタンが押されました"
        }

        // activity_main.xmlで指定したものを読み込んでいる
        //    R.layout.activity_main
        // -> res/layout/activity_main.xml
//        setContentView(R.layout.activity_main)

    }



}