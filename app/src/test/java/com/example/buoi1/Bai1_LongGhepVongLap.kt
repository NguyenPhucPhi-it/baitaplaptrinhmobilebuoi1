package com.example.buoi1

import org.junit.Test

class Bai1_LongGhepVongLap {

    fun printCakeBottom(age: Int, layers: Int) {
        repeat(layers) {
            repeat(age + 2) {
                print("@")
            }
            println()
        }
    }

    @Test
    fun main() {
        println("Bánh sinh nhật 5 tuổi, 3 tầng:")
        printCakeBottom(5, 3)
    }
}
