package com.example.btbuoi1

import org.junit.Test

class Bai3_Elvis {

    @Test
    fun testElvis() {
        println("=== ELVIS OPERATOR ===\n")

        var quantity: Int? = null
        println("quantity = $quantity")
        println("quantity ?: 0 = ${quantity ?: 0}")

        println()

        quantity = 4
        println("quantity = $quantity")
        println("quantity ?: 0 = ${quantity ?: 0}")
    }
}