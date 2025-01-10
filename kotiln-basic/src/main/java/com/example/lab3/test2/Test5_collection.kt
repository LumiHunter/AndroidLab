package com.example.lab3.test2

fun main() {
    val list1 = mutableListOf(10, 20)
    list1.add(30)
    list1.set(0, 40)
    println("${list1.size}, ${list1.get(0)}")

    val list2 = listOf(10,20,20)
    val set1 = setOf(10,20,20)
    println("List size: ${list2.size}, Set size: ${set1.size}")

    val map = mapOf<String, String>(Pair("one", "hello"), "two" to "new", "three" to "world")
    println("${map.get("one")}, ${map.get("two")}, ${map.get("three")}")
}

