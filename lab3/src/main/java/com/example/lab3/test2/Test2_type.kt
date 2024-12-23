package com.example.lab3.test2

fun main() {
    var data1: Int = 10
    println(data1)
    println("${data1.plus(10)}")
    println(data1)

    var data2: String = """
        hello
            jieun
        world
    """.trimIndent()
    println(data2)

    fun sum(): Int {
        return 10
    }

    var data3: Any = "hello"
    data3 = 10

    var data4: Int = 10
//    data4 = null  // error: nullable이 아니기 때문
    var data5: Int? = 10
    data5 = null
}