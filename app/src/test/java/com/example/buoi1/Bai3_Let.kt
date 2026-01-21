package com.example.btbuoi1

import org.junit.Test

class Bai3_Let {

    @Test
    fun testLet() {
        println("=== LET ===\n")

        val name = "Kotlin"
        name.let {
            println("Tên: $it")
            println("Độ dài: ${it.length}")
        }

        println()
        val nullableName: String? = "Android"
        nullableName?.let {
            println("Tên: $it")
        }

        val emptyName: String? = null
        emptyName?.let {
            println("Không chạy")
        } ?: println("Giá trị null")
    }
}