package com.example.buoi1

import org.junit.Test

class Bai1_HamCoDoiSo {


    fun printBorder(border: String, timesToRepeat: Int) {
        repeat(timesToRepeat) {
            print(border)
        }
        println()
    }

    @Test
    fun main() {
        printBorder("=", 20)
        printBorder("*", 15)
        printBorder("-", 25)
        printBorder("#", 10)
    }
}