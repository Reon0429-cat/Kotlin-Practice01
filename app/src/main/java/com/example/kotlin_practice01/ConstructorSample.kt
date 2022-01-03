package com.example.kotlin_practice01

import android.util.Log
import java.util.*
import android.util.Log.d as d1

class ConstructorSample {

}



class Person(val name: String) {
    var age: Int = 0
    fun message() {
        Log.d("message", "私は $name です。 $age 歳です。")
    }
}
