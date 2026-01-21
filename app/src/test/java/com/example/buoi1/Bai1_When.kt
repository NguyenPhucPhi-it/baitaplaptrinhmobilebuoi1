package com.example.buoi1

import org.junit.Test

class Bai1_When {

    @Test
    fun viDu1() {
        val rollResult = 4
        val luckyNumber = 3

        when (rollResult) {
            luckyNumber -> println("You won!")
            1 -> println("So sorry! You rolled a 1. Try again!")
            2 -> println("Sadly, you rolled a 2. Try again!")
            3 -> println("Unfortunately, you rolled a 3. Try again!")
            4 -> println("No luck! You rolled a 4. Try again!")
            5 -> println("Don't cry! You rolled a 5. Try again!")
            6 -> println("Apologies! you rolled a 6. Try again!")
        }
    }
}