package com.example.btbuoi1

import org.junit.Test

class Bai3_Lambda {

    @Test
    fun testLambda() {
        println("=== LAMBDA ===\n")

        val triple: (Int) -> Int = { a: Int -> a * 3 }
        println("triple(5) = ${triple(5)}")

        println()

        val add: (Int, Int) -> Int = { a, b -> a + b }
        println("add(3, 5) = ${add(3, 5)}")
    }
}