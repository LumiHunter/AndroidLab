package com.example.lab5.test1

fun main() {
    fun f1(no1:Int, no2:Int): Int {
        return no1 + no2
    }
    f1(10,20)

    val f2 = {no1:Int, no2:Int -> no1 + no2}
    f2(10, 20);

    // 선언과 동시에 호출
    {no1:Int, no2:Int -> no1 + no2}(10, 20)

    // 매개변수 1개 람다함수
    val f3 = {no:Int -> println(no)}
    val f4: (Int) -> Unit = { println(it) }
}