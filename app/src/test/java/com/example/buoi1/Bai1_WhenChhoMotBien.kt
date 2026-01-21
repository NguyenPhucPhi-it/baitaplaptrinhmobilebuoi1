package com.example.buoi1
import org.junit.Test
class Bai1_WhenChhoMotBien {

    @Test
    fun viDuChiDinhKetQuaWhen() {
        val diceRoll = 2

        val drawableResource = when (diceRoll) {
            1 -> "dice_1"
            2 -> "dice_2"
            3 -> "dice_3"
            4 -> "dice_4"
            5 -> "dice_5"
            else -> "dice_6"
        }

        println("Drawable được chọn là: $drawableResource")
    }
}