package com.example.btbuoi1

import org.junit.Test
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.abs

class Bai2_Khac {

    @Test
    fun testAugmentedAssignment() {
        println("=== PHÉP GÁN TĂNG CƯỜNG ===\n")

        var a = 10
        println("a = $a")

        a += 5  // a = a + 5
        println("a += 5  →  a = $a")

        a -= 3  // a = a - 3
        println("a -= 3  →  a = $a")

        a *= 2  // a = a * 2
        println("a *= 2  →  a = $a")

        a /= 4  // a = a / 4
        println("a /= 4  →  a = $a")
    }

    @Test
    fun testWithFunction() {
        println("=== HÀM WITH ===\n")

        data class House(
            val capacity: Int,
            val buildingMaterial: String,
            val residents: Int
        ) {
            fun hasRoom() = residents < capacity
        }

        val myHouse = House(
            capacity = 10,
            buildingMaterial = "Gỗ",
            residents = 6
        )

        // Không dùng with
        println("--- KHÔNG DÙNG WITH ---")
        println("Sức chứa: ${myHouse.capacity}")
        println("Vật liệu: ${myHouse.buildingMaterial}")
        println("Còn chỗ? ${myHouse.hasRoom()}")

        println()

        // Dùng with
        println("--- DÙNG WITH ---")
        with(myHouse) {
            println("Sức chứa: $capacity")
            println("Vật liệu: $buildingMaterial")
            println("Còn chỗ? ${hasRoom()}")
        }
    }

    @Test
    fun testMathLibrary() {
        println("=== THƯ VIỆN TOÁN HỌC ===\n")

        val radius = 5.0

        // Dùng import
        val area1 = PI * radius * radius
        println("Diện tích hình tròn (radius=$radius):")
        println("Cách 1 (import): $area1")

        // Dùng tên đầy đủ
        val area2 = kotlin.math.PI * radius * radius
        println("Cách 2 (full name): $area2")

        println()

        // Các hàm toán học khác
        println("--- CÁC HÀM TOÁN HỌC ---")
        println("sqrt(16) = ${sqrt(16.0)}")
        println("pow(2, 3) = ${2.0.pow(3.0)}")  // SỬA Ở ĐÂY
        println("abs(-5) = ${abs(-5)}")
        println("max(10, 20) = ${kotlin.math.max(10, 20)}")
        println("min(10, 20) = ${kotlin.math.min(10, 20)}")

        println()

        // Thêm ví dụ về pow
        println("--- VÍ DỤ POW ---")
        println("2^4 = ${2.0.pow(4.0)}")
        println("3^2 = ${3.0.pow(2.0)}")
        println("5^3 = ${5.0.pow(3.0)}")
        println("10^0 = ${10.0.pow(0.0)}")
    }

    @Test
    fun testVarargs() {
        println("=== ĐỐI SỐ BIẾN THIÊN ===\n")

        fun addToppings(vararg toppings: String) {
            println("Các topping:")
            for ((index, topping) in toppings.withIndex()) {
                println("  ${index + 1}. $topping")
            }
        }

        println("--- Pizza 1 ---")
        addToppings("phô mai", "xúc xích")

        println()

        println("--- Pizza 2 ---")
        addToppings("phô mai", "xúc xích", "nấm", "ớt chuông", "hành tây")

        println()

        // Tính tổng với varargs
        fun sum(vararg numbers: Int): Int {
            var total = 0
            for (num in numbers) {
                total += num
            }
            return total
        }

        println("--- TÍNH TỔNG ---")
        println("sum(1, 2, 3) = ${sum(1, 2, 3)}")
        println("sum(10, 20, 30, 40, 50) = ${sum(10, 20, 30, 40, 50)}")
    }
}