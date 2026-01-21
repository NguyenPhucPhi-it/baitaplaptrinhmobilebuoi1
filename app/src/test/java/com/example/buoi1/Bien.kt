package com.example.buoi1

import org.junit.Test

class Bien {
    @Test
    fun main() {

        val age = "5"
        val name = "Rover"

        var roll = 6
        var rolledValue: Int = 4

        println("Age: $age")
        println("Name: $name")
        println("Roll: $roll")
        println("Rolled Value: $rolledValue")

        roll = 10
        rolledValue = 8

        println("New Roll: $roll")
        println("New Rolled Value: $rolledValue")
    }
}