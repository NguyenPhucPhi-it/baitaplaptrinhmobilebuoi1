package com.example.btbuoi1

import org.junit.Test

interface ClickListener {
    fun onClick()
}

class Bai4_Object {

    @Test
    fun testObject() {
        println("=== OBJECT (Singleton) ===\n")

        val dataManager = object {
            private val data = mutableListOf<String>()

            fun addData(item: String) {
                data.add(item)
            }

            fun getData() = data
        }

        dataManager.addData("Item 1")
        dataManager.addData("Item 2")
        dataManager.addData("Item 3")

        println("Dữ liệu: ${dataManager.getData()}")

        println()

        val config = object {
            var appName = "MyApp"
            var version = "1.0.0"

            fun print() {
                println("App: $appName v$version")
            }
        }

        config.print()
    }

    @Test
    fun testObjectExpression() {
        println("=== OBJECT EXPRESSION ===\n")

        val greeter = object {
            val name = "Kotlin"
            fun greet() = println("Hello from $name!")
        }

        greeter.greet()

        println()

        // Dùng interface đã khai báo ở ngoài
        val button = object : ClickListener {
            override fun onClick() {
                println("Button clicked!")
            }
        }

        button.onClick()
    }
}