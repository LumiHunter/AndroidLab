package com.example.lab4.test3

val obj1 = object {
    var data = 10
    fun some() {
        println("some().. $data")
    }
}

open class Super_obj {
    open var data = 10
    open fun some() {
        println("Super some().. $data")
    }
}

val obj2 = object:Super_obj() {
    override var data = 20
    override fun some() {
        println("object some() $data")
    }
}
fun main() {
//    obj1.data = 20
//    obj1.some()   // obj1은 Any type이므로 data, some()을 가지고 있지 않다!
    obj2.data = 20
    obj2.some()
}