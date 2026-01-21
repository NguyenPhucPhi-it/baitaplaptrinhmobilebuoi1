package com.example.btbuoi1

import org.junit.Test

class Bai3_SafeCall {

    @Test
    fun testSafeCall() {
        println("=== SAFE CALL ===\n")

        val text: String? = "Kotlin"
        val nullText: String? = null

        println("Độ dài text: ${text?.length}")
        println("Độ dài nullText: ${nullText?.length}")
    }
}