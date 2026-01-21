package com.example.btbuoi1

import org.junit.Test

class Bai2_DanhSach {

    @Test
    fun testList() {
        println("=== BÀI 2: DANH SÁCH ===\n")

        // List chỉ đọc
        println("--- LIST CHỈ ĐỌC ---")
        val numbers = listOf(1, 2, 3, 4, 5, 6)
        println("Danh sách: $numbers")
        println("Kích thước: ${numbers.size}")
        println("Phần tử đầu: ${numbers[0]}")
        println("Phần tử cuối: ${numbers[numbers.size - 1]}")

        // Đảo ngược
        val colors = listOf("đỏ", "xanh dương", "xanh lá")
        println("\nMàu gốc: $colors")
        println("Màu đảo: ${colors.reversed()}")

        println()

        // List có thể thay đổi
        println("--- LIST CÓ THỂ THAY ĐỔI ---")
        val entrees = mutableListOf<String>()

        println("Ban đầu: $entrees")

        // Thêm món
        entrees.add("spaghetti")
        entrees.add("pizza")
        entrees.add("salad")
        println("Sau khi thêm: $entrees")

        // Sửa món
        entrees[0] = "lasagna"
        println("Sau khi sửa món đầu: $entrees")

        // Xóa món
        entrees.remove("pizza")
        println("Sau khi xóa pizza: $entrees")

        // Thêm nhiều món
        entrees.addAll(listOf("burger", "hotdog", "sandwich"))
        println("Thêm nhiều món: $entrees")
    }

    @Test
    fun testListOperations() {
        println("=== THAO TÁC VỚI LIST ===\n")

        val fruits = listOf("táo", "chuối", "cam", "xoài", "dâu")

        // Lấy phần tử
        println("Danh sách: $fruits")
        println("Quả đầu tiên: ${fruits.first()}")
        println("Quả cuối cùng: ${fruits.last()}")
        println("Lấy 3 quả đầu: ${fruits.take(3)}")

        // Kiểm tra
        println("\nCó 'cam' không? ${fruits.contains("cam")}")
        println("Có 'nho' không? ${fruits.contains("nho")}")

        // Sắp xếp
        println("\nSắp xếp A-Z: ${fruits.sorted()}")
        println("Sắp xếp Z-A: ${fruits.sortedDescending()}")
    }
}