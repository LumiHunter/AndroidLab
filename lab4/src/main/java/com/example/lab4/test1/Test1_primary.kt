package com.example.lab4.test1

class User1

class User2(name: String, count: Int) {
    var name: String
    var count: Int
    init {
        println("init... $name, $count")
        this.name = name
        this.count = count
    }
    fun sayHello() {
        println("sayHello.. $name, $count")
    }
}

class User3(val name: String, val count: Int) {
    fun sayHello() {
        println("sayHello.. $name, $count")
    }
}
fun main() {
    val user1 = User1()
    val user2 = User2("kim", 10)
    user2.sayHello()
    var user3 = User3("Lee", 12)
    user3.sayHello()
}