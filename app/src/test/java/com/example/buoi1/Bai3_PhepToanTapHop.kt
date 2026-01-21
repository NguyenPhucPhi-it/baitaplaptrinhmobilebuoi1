package com.example.btbuoi1

import org.junit.Test

class Bai3_PhepToanTapHop {

    @Test
    fun testForEach() {
        println("=== LẶP LẠI TẬP HỢP (forEach) ===\n")

        val peopleAges = mutableMapOf(
            "Fred" to 31,
            "Ann" to 23,
            "Barbara" to 42,
            "Joe" to 51
        )

        // forEach
        print("Tuổi mọi người: ")
        peopleAges.forEach { print("${it.key} is ${it.value}, ") }
        println()

        println()

        // forEach với destructuring
        println("--- DANH SÁCH CHI TIẾT ---")
        peopleAges.forEach { (name, age) ->
            println("$name: $age tuổi")
        }
    }

    @Test
    fun testMap() {
        println("=== CHUYỂN ĐỔI (map) ===\n")

        val peopleAges = mapOf(
            "Fred" to 31,
            "Ann" to 23,
            "Barbara" to 42,
            "Joe" to 51
        )

        // map
        val descriptions = peopleAges.map { "${it.key} is ${it.value}" }
        println("Danh sách mô tả:")
        descriptions.forEach { println("  $it") }

        println()

        // joinToString
        println("Nối thành chuỗi:")
        val result = peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ")
        println(result)

        println()

        // map với list
        val numbers = listOf(1, 2, 3, 4, 5)
        val doubled = numbers.map { it * 2 }
        println("Số gốc: $numbers")
        println("Nhân đôi: $doubled")
    }

    @Test
    fun testFilter() {
        println("=== LỌC (filter) ===\n")

        val peopleAges = mapOf(
            "Fred" to 31,
            "Ann" to 23,
            "Barbara" to 42,
            "Joe" to 51
        )

        // Lọc theo độ dài tên
        println("--- LỌC TÊN NGẮN (< 4 ký tự) ---")
        val filteredNames = peopleAges.filter { it.key.length < 4 }
        println(filteredNames)

        println()

        // Lọc theo tuổi
        println("--- LỌC NGƯỜI TRÊN 30 TUỔI ---")
        val over30 = peopleAges.filter { it.value > 30 }
        println(over30)

        println()

        // Lọc list
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println("--- LỌC SỐ CHẴN ---")
        val evenNumbers = numbers.filter { it % 2 == 0 }
        println("Số gốc: $numbers")
        println("Số chẵn: $evenNumbers")
    }

    @Test
    fun testComplexOperations() {
        println("=== CÁC PHÉP TOÁN PHỨC TẠP ===\n")

        val words = listOf("about", "acute", "balloon", "best", "brief", "class")

        println("Danh sách từ: $words")
        println()

        // Chuỗi thao tác
        val result = words
            .filter { it.startsWith("b", ignoreCase = true) }
            .shuffled()
            .take(2)
            .sorted()

        println("--- CÁC BƯỚC XỬ LÝ ---")
        println("1. Lọc từ bắt đầu bằng 'b': ${words.filter { it.startsWith("b", ignoreCase = true) }}")
        println("2. Xáo trộn (shuffled)")
        println("3. Lấy 2 từ đầu (take 2)")
        println("4. Sắp xếp (sorted)")
        println()
        println("Kết quả cuối: $result")

        println()


        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        val processed = numbers
            .filter { it % 2 == 0 }  // Lấy số chẵn
            .map { it * it }         // Bình phương
            .take(3)                 // Lấy 3 số đầu
            .sum()                   // Tính tổng

        println("Số gốc: $numbers")
        println("→ Lọc số chẵn: ${numbers.filter { it % 2 == 0 }}")
        println("→ Bình phương: ${numbers.filter { it % 2 == 0 }.map { it * it }}")
        println("→ Lấy 3 số đầu: ${numbers.filter { it % 2 == 0 }.map { it * it }.take(3)}")
        println("→ Tổng: $processed")
    }

    @Test
    fun testMoreOperations() {
        println("=== CÁC PHÉP TOÁN KHÁC ===\n")

        val numbers = listOf(5, 2, 9, 1, 7, 3, 8)

        println("Danh sách: $numbers")
        println()

        // Các phép toán thống kê
        println("--- THỐNG KÊ ---")
        println("Tổng (sum): ${numbers.sum()}")
        println("Trung bình (average): ${numbers.average()}")
        println("Lớn nhất (max): ${numbers.maxOrNull()}")
        println("Nhỏ nhất (min): ${numbers.minOrNull()}")
        println("Số lượng (count): ${numbers.count()}")

        println()

        // Nhóm
        println("--- NHÓM (groupBy) ---")
        val grouped = numbers.groupBy { if (it % 2 == 0) "chẵn" else "lẻ" }
        println(grouped)

        println()

        // Partition
        println("--- PHÂN CHIA (partition) ---")
        val (even, odd) = numbers.partition { it % 2 == 0 }
        println("Số chẵn: $even")
        println("Số lẻ: $odd")
    }
}