package com.example.kotlin_practice01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity_main.xmlで指定したものを読み込んでいる
        //    R.layout.activity_main
        // -> res/layout/activity_main.xml
        setContentView(R.layout.activity_main)
    }
}