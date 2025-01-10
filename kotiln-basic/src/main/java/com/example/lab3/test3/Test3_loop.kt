package com.example.lab3.test3

fun main() {
    var sum = 0
    for (i in 1 .. 10) {
        sum += 1
    }
    println("sum: $sum")

    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    val data = arrayOf(10, 20, 30)
    for (i in data.indices) {
        println(data[i])
    }
    for ((index, value) in data.withIndex()) {
        println("$index, $value")
    }
}