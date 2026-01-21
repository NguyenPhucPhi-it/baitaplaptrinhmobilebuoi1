package com.example.btbuoi1

import org.junit.Test

class Bai3_BackingProperty {

    @Test
    fun testBackingProperty() {
        println("=== BACKING PROPERTY ===\n")

        class Counter {
            private var _count = 0
            val count: Int
                get() = _count

            fun increment() {
                _count++
            }
        }

        val counter = Counter()
        println("Count: ${counter.count}")

        counter.increment()
        counter.increment()
        println("Sau 2 lần increment: ${counter.count}")
    }
}