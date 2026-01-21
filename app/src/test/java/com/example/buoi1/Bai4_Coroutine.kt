package com.example.buoi1

import kotlinx.coroutines.*
import org.junit.Test

class Bai4_Coroutine {

    suspend fun getValue(): Double {
        delay(1000)
        return 42.5
    }

    @Test
    fun runSuspendFunction() = runBlocking {
        println("=== BÀI 4: CHẠY HÀM TẠM NGƯNG ===")

        // Chạy hàm suspend trong GlobalScope
        GlobalScope.launch {
            val output = getValue()
            println("Giá trị từ GlobalScope: $output")
        }

        delay(1500)
    }

    suspend fun processValue() {
        println("=== BÀI 4: GỌI HÀM SUSPEND TỪ HÀM SUSPEND ===")
        val value = getValue()
        val modified = value * 2
        println("Giá trị gốc: $value")
        println("Giá trị đã xử lý: $modified")
    }

    @Test
    fun callSuspendFromSuspend() = runBlocking {
        processValue()
    }

    @Test
    fun accessCoroutineJob() = runBlocking {
        println("=== BÀI 4: TRUY CẬP VÀO JOB ===")

        val job: Job = GlobalScope.launch {
            val output = getValue()
            println("Job đang chạy, giá trị: $output")
        }

        delay(500)
        println("Trạng thái Job: isActive = ${job.isActive}")

        job.join()
        println("Job đã hoàn thành")
    }

    @Test
    fun cancelCoroutineJob() = runBlocking {
        println("=== BÀI 4: HỦY JOB ===")

        val job: Job = GlobalScope.launch {
            repeat(10) { i ->
                println("Job đang chạy lần $i")
                delay(500)
            }
        }

        delay(1300)
        println("Hủy job...")
        job.cancel()

        delay(500)
        println("Job đã bị hủy")
    }

    @Test
    fun runBlockingExample() {
        println("=== BÀI 4: RUN BLOCKING ===")


        runBlocking {
            val output = getValue()
            println("Kết quả từ runBlocking: $output")
        }

        println("runBlocking đã hoàn tất")
    }

    @Test
    fun asyncAwaitExample() = runBlocking {
        println("=== BÀI 4: ASYNC/AWAIT ===")

        val deferred1 = async { getValue() }
        val deferred2 = async { getValue() * 2 }

        println("Đang tính toán...")

        val result1 = deferred1.await()
        val result2 = deferred2.await()

        println("Kết quả 1: $result1")
        println("Kết quả 2: $result2")
        println("Tổng: ${result1 + result2}")
    }
}