package com.example.lab5.test2

fun main() {
    var data: String? = null
    var length = data?.length?:0
    println("data length: $length")

    data = "hello"
    length = data?.length?:0
    println("data length: $length")

    fun some(data: String?): Int {
        return data!!.length
    }
    println(some("Kim"))
    println(some(null))
}