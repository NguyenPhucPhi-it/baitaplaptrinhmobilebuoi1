package com.example.btbuoi1

import org.junit.Test

class Bai3_Lateinit {

    @Test
    fun testLateinit() {
        println("=== LATEINIT ===\n")

        class UserManager {
            private lateinit var currentUser: String

            fun login(username: String) {
                currentUser = username
            }

            fun getUser(): String {
                return if (::currentUser.isInitialized) {
                    currentUser
                } else {
                    "Chưa đăng nhập"
                }
            }
        }

        val manager = UserManager()
        println("Trước login: ${manager.getUser()}")

        manager.login("user123")
        println("Sau login: ${manager.getUser()}")
    }
}