package com.example.btbuoi1

import org.junit.Test

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

enum class Planet(val mass: Double, val radius: Double) {
    EARTH(5.97e24, 6371.0),
    MARS(6.42e23, 3390.0),
    JUPITER(1.90e27, 69911.0);

    fun surfaceGravity(): Double {
        val G = 6.67e-11
        return G * mass / (radius * radius)
    }
}

enum class Status {
    PENDING, APPROVED, REJECTED;

    companion object {
        fun fromString(value: String): Status? {
            return values().find { it.name == value.uppercase() }
        }
    }
}

enum class MenuItem(val price: Int, val description: String) {
    PHO(50000, "Phở bò"),
    BUN_CHA(45000, "Bún chả Hà Nội"),
    COM_TAM(40000, "Cơm tấm sườn"),
    BANH_MI(20000, "Bánh mì pate");

    fun display() {
        println("${description}: ${price}đ")
    }
}

// ===== CLASS TEST =====

class Bai4_Enum {

    @Test
    fun testEnum() {
        println("=== ENUM CLASS ===\n")

        val direction = Direction.NORTH
        println("Hướng: $direction")

        println()

        when (direction) {
            Direction.NORTH -> println("Đi về phía Bắc")
            Direction.SOUTH -> println("Đi về phía Nam")
            Direction.WEST -> println("Đi về phía Tây")
            Direction.EAST -> println("Đi về phía Đông")
        }

        println()

        println("--- TẤT CẢ CÁC HƯỚNG ---")
        for (dir in Direction.values()) {
            println(dir)
        }

        println()

        val color = Color.RED
        println("Màu: $color")
        println("RGB: ${color.rgb.toString(16).uppercase()}")
    }

    @Test
    fun testEnumAdvanced() {
        println("=== ENUM NÂNG CAO ===\n")

        println("--- HÀNH TINH ---")
        for (planet in Planet.values()) {
            println("${planet.name}:")
            println("  Khối lượng: ${planet.mass} kg")
            println("  Bán kính: ${planet.radius} km")
            println("  Trọng lực: ${"%.2f".format(planet.surfaceGravity())} m/s²")
            println()
        }

        println("--- ENUM VỚI COMPANION OBJECT ---")
        println("Status.fromString('pending') = ${Status.fromString("pending")}")
        println("Status.fromString('approved') = ${Status.fromString("approved")}")
        println("Status.fromString('invalid') = ${Status.fromString("invalid")}")
    }

    @Test
    fun testEnumPractical() {
        println("=== VÍ DỤ THỰC TẾ ===\n")

        println("--- MENU NHÀ HÀNG ---")
        for (item in MenuItem.values()) {
            item.display()
        }

        println()

        println("--- ĐẶT MÓN ---")
        val order = listOf(MenuItem.PHO, MenuItem.BANH_MI, MenuItem.PHO)

        var total = 0
        println("Đơn hàng:")
        order.forEach { item ->
            println("  - ${item.description}: ${item.price}đ")
            total += item.price
        }
        println("Tổng cộng: ${total}đ")
    }
}