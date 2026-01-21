package com.example.btbuoi1

import org.junit.Test

class Bai2_VongLap {

    @Test
    fun testForLoop() {
        println("=== VÒNG LẶP FOR ===\n")

        val fruits = listOf("táo", "chuối", "cam", "xoài")

        // For cơ bản
        println("--- Duyệt danh sách ---")
        for (fruit in fruits) {
            println("Tôi thích $fruit")
        }

        println()

        // For với index
        println("--- Duyệt với chỉ số ---")
        for (index in fruits.indices) {
            println("${index + 1}. ${fruits[index]}")
        }

        println()

        // For với range
        println("--- Duyệt từ 1 đến 10 ---")
        for (i in 1..10) {
            print("$i ")
        }
        println()

        println()

        // For đảo ngược
        println("--- Đếm ngược từ 10 ---")
        for (i in 10 downTo 1) {
            print("$i ")
        }
        println()

        println()

        // For với bước nhảy
        println("--- Số chẵn từ 0 đến 20 ---")
        for (i in 0..20 step 2) {
            print("$i ")
        }
        println()
    }

    @Test
    fun testWhileLoop() {
        println("=== VÒNG LẶP WHILE ===\n")

        val myList = listOf("A", "B", "C", "D", "E")

        // While
        println("--- While loop ---")
        var index = 0
        while (index < myList.size) {
            println("${index + 1}. ${myList[index]}")
            index++
        }

        println()

        // Do-While
        println("--- Do-While loop ---")
        var count = 1
        do {
            println("Lần thứ $count")
            count++
        } while (count <= 5)
    }

    @Test
    fun testLoopWithBreakContinue() {
        println("=== BREAK VÀ CONTINUE ===\n")

        // Break
        println("--- Dừng khi gặp số 5 ---")
        for (i in 1..10) {
            if (i == 5) {
                println("Gặp số 5, dừng lại!")
                break
            }
            println("Số: $i")
        }

        println()

        // Continue
        println("--- Bỏ qua số chẵn ---")
        for (i in 1..10) {
            if (i % 2 == 0) {
                continue
            }
            println("Số lẻ: $i")
        }
    }
}