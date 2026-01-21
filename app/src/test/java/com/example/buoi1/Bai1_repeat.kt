package com.example.buoi1

import org.junit.Test

class Bai1_repeat {

    fun printBorder() {
        repeat(23) {
            print("=")
        }
        println()
    }

    @Test
    fun main() {
        printBorder()
    }
}