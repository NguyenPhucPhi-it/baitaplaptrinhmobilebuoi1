package com.example.btbuoi1

import org.junit.Test

class Bai3_Apply {

    @Test
    fun testApply() {
        println("=== APPLY ===\n")

        data class Person(
            var name: String = "",
            var age: Int = 0
        )

        val person = Person().apply {
            name = "Nguyễn Văn A"
            age = 25
        }

        println("Tên: ${person.name}")
        println("Tuổi: ${person.age}")
    }
}