package com.example.lab3.test3

fun main() {
    var data = 10
    if (data > 0) {
        println("data > 0")
    } else {
        println("data <= 0")
    }

    val result = if(data > 0) {
        println("data > 0")
        10
    } else {
        println("data <= 0")
        20
    }
    println("result: $result")
}