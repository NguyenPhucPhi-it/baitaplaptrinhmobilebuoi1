package com.example.buoi1

class Bai1_Class {
    var sides = 6

    fun roll() {
        val randomNumber = (1..sides).random()
        println(randomNumber)
    }
}