package com.example.lab4.test2

open class Super1 {
    val someData = 10
    fun someFun() {
        println("Super someFun()")
    }
}

class Sub1: Super1() {}

open class Super2 {
    open val someData = 10
    open fun someFun() {
        println("Super someFun()")
    }
}

class Sub2: Super2() {
    override val someData = 20
    override fun someFun() {
        println("Sub somFun()")
    }
}

fun main() {
    val sub1 = Sub1()
    println(sub1.someData)
    sub1.someFun()

    val sub2 = Sub2()
    println(sub2.someData)
    sub2.someFun()
}