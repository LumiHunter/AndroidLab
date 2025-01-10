package com.example.lab5.test1

typealias MyFunType = (Int, Int) -> Boolean

fun hofFun(arg: (Int) -> Boolean): () -> String {
    val result = if(arg(10)) {
        "valid"
    } else {
        "invalid"
    }
    return  {"hofresult : $result"}
}
fun main() {
    val f1: (Int, Int) -> Int = {no1:Int, no2:Int -> no1 + no2}
    val f2 = {no1:Int, no2:Int -> no1 + no2}    // 타입 유추 가능하기에 타입 선언 생략
    val f3: (Int, Int) -> Int = {no1, no2 -> no1 + no2}

    val f4: MyFunType = {no1, no2 -> no1 > no2}

    val result = hofFun { no -> no > 0 }
    println(result())
}