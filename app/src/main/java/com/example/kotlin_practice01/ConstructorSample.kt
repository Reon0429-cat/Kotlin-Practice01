package com.example.kotlin_practice01

import android.util.Log
import android.util.Log.d as d1

class ConstructorSample {

}

open class Person(val name: String) {}
class Student(name: String, var degree: String): Person(name) {}
val student = Student("REON", "学生")


interface Animal {
    fun eat()
    fun say() {
        print("hello")
    }
}

class Dog: Animal {
    override fun eat() {
        print("ドッグフード")
    }
    override fun say() {
        super.say()

        Log.d("REON", "私は犬です")

    }
}