package com.example.btbuoi1

import org.junit.Test

class Bai2_Chuoi {

    @Test
    fun testString() {
        println("=== BÀI 2: CHUỖI ===\n")

        // Độ dài chuỗi
        val name = "Android"
        println("Tên: $name")
        println("Độ dài: ${name.length} ký tự")

        println()

        // String template với biến
        val number = 10
        println("$number người")
        println("Tổng: ${number + 5} người")

        println()

        // String template với biểu thức
        val groups = 5
        println("Số nhóm: $groups")
        println("Tổng số người: ${number * groups} người")

        println()

        // Thao tác với chuỗi
        val text = "Học Kotlin rất thú vị"
        println("Chuỗi gốc: $text")
        println("Chữ hoa: ${text.uppercase()}")
        println("Chữ thường: ${text.lowercase()}")
        println("Chứa 'Kotlin'? ${text.contains("Kotlin")}")
        println("Bắt đầu bằng 'Học'? ${text.startsWith("Học")}")
        println("Kết thúc bằng 'vị'? ${text.endsWith("vị")}")
    }

    @Test
    fun testStringOperations() {
        println("=== THAO TÁC CHUỖI ===\n")

        val sentence = "  Kotlin là ngôn ngữ tuyệt vời  "

        println("Chuỗi gốc: '$sentence'")
        println("Loại bỏ khoảng trắng: '${sentence.trim()}'")

        println()

        // Tách chuỗi
        val words = sentence.trim().split(" ")
        println("Tách thành từ: $words")
        println("Số từ: ${words.size}")

        println()

        // Nối chuỗi
        val firstName = "Nguyễn"
        val lastName = "An"
        println("Họ: $firstName")
        println("Tên: $lastName")
        println("Họ và tên: $firstName $lastName")

        println()

        // Replace
        val oldText = "Java is good"
        val newText = oldText.replace("Java", "Kotlin")
        println("Cũ: $oldText")
        println("Mới: $newText")
    }
}