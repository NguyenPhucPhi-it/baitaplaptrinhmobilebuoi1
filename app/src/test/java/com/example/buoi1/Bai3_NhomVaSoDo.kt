package com.example.btbuoi1

import org.junit.Test

class Bai3_NhomVaSoDo {

    @Test
    fun testSet() {
        println("=== NHÓM (SET) ===\n")

        // Tạo set từ list
        println("--- TẠO SET TỪ LIST ---")
        val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
        println("List gốc: $numbers")

        val setOfNumbers = numbers.toSet()
        println("Chuyển thành Set: $setOfNumbers")
        println("(Các phần tử trùng đã bị loại bỏ)")

        println()

        // Định nghĩa set
        println("--- ĐỊNH NGHĨA SET ---")
        val set1 = setOf(1, 2, 3)
        val set2 = mutableSetOf(3, 4, 5)

        println("Set 1: $set1")
        println("Set 2: $set2")

        println()

        // Phép toán trên set
        println("--- PHÉP TOÁN TRÊN SET ---")

        // Giao (intersect)
        val giao = set1.intersect(set2)
        println("Giao của Set1 và Set2: $giao")

        // Hợp (union)
        val hop = set1.union(set2)
        println("Hợp của Set1 và Set2: $hop")

        // Hiệu (subtract)
        val hieu = set1.subtract(set2)
        println("Hiệu Set1 - Set2: $hieu")

        println()

        // MutableSet
        println("--- MUTABLE SET ---")
        val fruits = mutableSetOf("táo", "chuối")
        println("Ban đầu: $fruits")

        fruits.add("cam")
        println("Thêm 'cam': $fruits")

        fruits.add("táo") // Không thêm được vì đã có
        println("Thêm 'táo' (trùng): $fruits")

        fruits.remove("chuối")
        println("Xóa 'chuối': $fruits")
    }

    @Test
    fun testMap() {
        println("=== SƠ ĐỒ (MAP) ===\n")

        // Định nghĩa map
        println("--- ĐỊNH NGHĨA MAP ---")
        val peopleAges = mutableMapOf<String, Int>(
            "Fred" to 30,
            "Ann" to 23
        )
        println("Map ban đầu: $peopleAges")

        println()

        // Thêm phần tử
        println("--- THÊM PHẦN TỬ ---")
        peopleAges.put("Barbara", 42)
        println("Thêm Barbara: $peopleAges")

        peopleAges["Joe"] = 51
        println("Thêm Joe: $peopleAges")

        println()

        // Truy cập phần tử
        println("--- TRUY CẬP PHẦN TỬ ---")
        println("Tuổi của Fred: ${peopleAges["Fred"]}")
        println("Tuổi của Ann: ${peopleAges["Ann"]}")

        println()

        // Cập nhật
        println("--- CẬP NHẬT ---")
        peopleAges["Fred"] = 31
        println("Fred tăng tuổi: $peopleAges")

        println()

        // Kiểm tra
        println("--- KIỂM TRA ---")
        println("Có chứa key 'Ann'? ${peopleAges.containsKey("Ann")}")
        println("Có chứa value 51? ${peopleAges.containsValue(51)}")
        println("Có chứa key 'John'? ${peopleAges.containsKey("John")}")
    }

    @Test
    fun testMapAdvanced() {
        println("=== MAP NÂNG CAO ===\n")

        // Map với data phức tạp
        data class Student(val name: String, val age: Int, val grade: Double)

        val students = mapOf(
            "SV001" to Student("An", 20, 8.5),
            "SV002" to Student("Bình", 21, 7.8),
            "SV003" to Student("Cúc", 19, 9.2)
        )

        println("--- DANH SÁCH SINH VIÊN ---")
        for ((id, student) in students) {
            println("$id: ${student.name}, ${student.age} tuổi, Điểm: ${student.grade}")
        }

        println()

        // Tìm sinh viên theo điều kiện
        println("--- TÌM SINH VIÊN GIỎI (>= 8.0) ---")
        val goodStudents = students.filter { it.value.grade >= 8.0 }
        for ((id, student) in goodStudents) {
            println("$id: ${student.name} - ${student.grade}")
        }
    }
}