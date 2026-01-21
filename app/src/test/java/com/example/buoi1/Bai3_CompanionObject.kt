package com.example.btbuoi1

import org.junit.Test


class MathUtils {
    companion object {
        const val PI = 3.14159

        fun square(x: Int) = x * x

        fun cube(x: Int) = x * x * x
    }
}

class Bai3_CompanionObject {

    @Test
    fun testCompanion() {
        println("=== COMPANION OBJECT ===\n")

        println("PI = ${MathUtils.PI}")
        println("square(5) = ${MathUtils.square(5)}")
        println("cube(3) = ${MathUtils.cube(3)}")
    }
}