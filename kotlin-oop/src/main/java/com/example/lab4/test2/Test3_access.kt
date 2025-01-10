package com.example.lab4.test2

open class Access {
    var data1 = 10
    protected var data2 = 10
    private var data3 = 10
}

class accessSub: Access() {
    fun someFun() {
        data1++
        data2++
//        data3++   // error: private
    }
}

fun main() {
    val obj = Access()
    obj.data1++
//    obj.data2++   // error: protected
//    obj.data3++
}