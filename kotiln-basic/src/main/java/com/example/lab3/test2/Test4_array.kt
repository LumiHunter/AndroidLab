package com.example.lab3.test2

fun main() {
    val data1:Array<Int> = Array(3, {0})
    data1[0] = 10
    data1.set(1, 20)
    println("""
    array size: ${data1.size}
    array data: $data1
                ${data1[0]}, ${data1.get(1 )}, ${data1[2]}
    """)

    val array2: IntArray = IntArray(3, { 0 })
    val array3 = arrayOf<Int>(10,20)
    val array4 = intArrayOf(10, 20)
}