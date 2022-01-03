package com.example.kotlin_practice01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin_practice01.databinding.ActivityMainBinding
import java.util.*


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


//        val person = Person("REON")
//        person.age = 21
//        Log.d("Person", person.message()
        // 私は REON です。 21 歳です。

//        with(Person("REON")) {
//            age = 21
//            message()
//        }
//
//        Person("REON").apply {
//            age = 22
//        }.message()
//
//        var name: String? = "reon"
//        var upperCaseName = name?.uppercase(Locale.getDefault())
//        var nameLength = name?.length
//        Log.d("message", "$upperCaseName $nameLength") // REON 4

        var name: String? = "reon"
//        var output = name?.let {
//            var upperCaseName = it.uppercase(Locale.getDefault())
//            var nameLength = it.length
//            "$upperCaseName $nameLength"
//        } ?: "null"
//        Log.d("message", output)

        var output = name?.run {
            "${uppercase(Locale.getDefault())} $length"
        } ?: "null"
        Log.d("message", output)


        val arrayInt = listOf(1, 2, 3).also {
            Log.d("message", "$it") // [1, 2, 3]
        }
        for (int in arrayInt) {
            Log.d("message", "$int")
        }

    }



}
