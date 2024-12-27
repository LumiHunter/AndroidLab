package com.example.lab4.test3

class A(val name: String, val email: String)
data class B(val name: String, val email: String) {
    lateinit var address: String
    constructor(name: String, email: String, address: String): this(name, email) {
        this.address = address
    }
}

fun main() {
    val a1 = A("Kim", "a@a.com")
    val a2 = A("Kim", "a@a.com")

    val b1 = B("Park", "b@b.com")
    val b2 = B("Park", "b@b.com")
    val b3 = B("Park", "b@b.com", "Seoul")
    val b4 = B("Park", "b@b.com", "Busan")

    println(a1.equals(a2))  // 주소값을 비교하기 때문에 false
    println(b1.equals((b2)))    // 같은 데이터클래스 안에서는 값만 비교하도록 되어 있으므로 true
    println(b3.equals(b4))  // 데이터클래스 영역(주 생성자)에서는 true이므로, 보조생성자 영역이 달라도 true 반환

    println(a1.toString())  // 주소값이 프린트
    println(b1.toString())
    println(b3.toString())  // 데이터클래스 영역까지만 프린트
}