package com.example.lab3.test2

val data1: Int = 10 // 값 변경 불가: val
var data2 = 10  // 값 변경 가능: var, 타입을 유추 가능할 때는 타입 명시 생략.

fun myFun() {
//    data1 = 20    //error: val은 값 변경 불가
    data2 = 20
}

class User

//lateinit var data3: Int   // 기초 타입에는 lateinit 사용 불가
lateinit var user: User
lateinit var data4: String

val data5 by lazy {
    println("in lazy")
    20
}

fun main() {
    println("main..")
    println(data5)
    println(data5)
}