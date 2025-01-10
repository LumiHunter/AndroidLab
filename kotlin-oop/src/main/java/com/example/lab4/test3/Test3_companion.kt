package com.example.lab4.test3

class MyClass {
    var data1 = 10
    fun some1() {
        println("$data1")
    }
    companion object {
        var data2 = 20
        fun some2() {
            println("companion")
        }
    }
}

fun main() {
    val obj = MyClass()
    obj.data1 = 20
    obj.some1()
    MyClass.data2
    MyClass.some2()
}