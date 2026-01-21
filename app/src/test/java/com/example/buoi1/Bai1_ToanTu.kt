package com.example.buoi1

import org.junit.Test

class Bai1_ToanTu {

    @Test
    fun main() {

        val a = 10
        val b = 3


        println("=== TOÁN TỬ SỐ HỌC ===")
        println("a = $a, b = $b")
        println()


        val tong = a + b
        println("Cộng: $a + $b = $tong")


        val hieu = a - b
        println("Trừ: $a - $b = $hieu")


        val tich = a * b
        println("Nhân: $a * $b = $tich")


        val thuong = a / b
        println("Chia: $a / $b = $thuong")

        val du = a % b
        println("Chia lấy dư: $a % $b = $du")

        println()


        println("=== TOÁN TỬ GÁN ===")
        var x = 5
        println("x = $x")

        x = 10  // Gán lại giá trị
        println("Sau khi x = 10: x = $x")

        x += 5  // x = x + 5
        println("Sau khi x += 5: x = $x")

        x -= 3  // x = x - 3
        println("Sau khi x -= 3: x = $x")

        x *= 2  // x = x * 2
        println("Sau khi x *= 2: x = $x")

        x /= 4  // x = x / 4
        println("Sau khi x /= 4: x = $x")

        println()

        println("=== CHIA SỐ THỰC ===")
        val m = 10.0
        val n = 3.0
        val ketQua = m / n
        println("$m / $n = $ketQua")


        val ketQua2 = a.toDouble() / b.toDouble()
        println("$a / $b (số thực) = $ketQua2")
    }
}
