package com.example.lab3.test2

fun main() {
    fun some1(data1: Int): Int {
//        data1 = 20    //함수의 매개변수는 자동으로 val이기 때문에 변경불가
        return 10
    }

    fun some2(data1: Int, data2: Int = 0) {
        println("data1: $data1, data2: $data2")
    }
    some2(10, 20)
    some2(10)
    some2(data2 = 10, data1 = 30)
}