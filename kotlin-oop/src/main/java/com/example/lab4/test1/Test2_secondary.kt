package com.example.lab4.test1

class Use1 {
    constructor(name: String) {
        println("constructor(name: String)")
    }

    constructor(name: String, count: Int) {
        println("constructor(name: String, count: Int)")
    }
}

class Use2(name: String) {
    constructor(name: String, count: Int): this(name) {}
}

class Use3(name: String) {
    constructor(name: String, count: Int): this(name) {}
    constructor(name:String, count: Int, ege:Int): this(name, count) {}
}
fun main() {
    val user1 = Use1("kim")
    val user2 = Use1("kang", 10)
}