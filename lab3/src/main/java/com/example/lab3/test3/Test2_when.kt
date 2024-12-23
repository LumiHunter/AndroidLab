package com.example.lab3.test3

fun main() {
    val data1 = 10
    when (data1) {
        10 -> println("data is 10")
        20 -> {
            println("data is 20")
        }
        else -> println("data1 is not 1- or 20")
    }

    val data2: String = "hello"
    when (data2) {
        "hello" -> println("HELLO")
        "world" -> println("WORLD")
    }

    val data3: Any = 10
    when (data3) {
        is String -> println("data3 is String")
        20, 30 -> println("data3 is 10 or 20")
        in 1 .. 10 -> println("data3 is 1..10")
    }

    val result = when {
        data1 > 10 -> "data1 > 10"
        data2 == "hello" -> "HELLO"
        data3 is Int -> "data2 is integer"
        else -> "data1 <= 10"
    }   // 복수가 해당될 경우 위가 우선
    println("result: $result")
}

