package com.example.buoi1

class Bai2_LopCoThongSo(val numSides: Int) {
    fun roll(): Int {
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
}