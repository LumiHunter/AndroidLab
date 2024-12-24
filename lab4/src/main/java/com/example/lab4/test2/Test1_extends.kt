package com.example.lab4.test2

open class Super(name: String)

class Sub: Super("default")

class sub1(name: String): Super(name)

class sub2: Super {
    constructor(name: String): super(name) {}
}