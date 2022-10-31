package com.immoc.demo_04

object Demo16 {

    class Person {
        var name: String = ""
        var age: Int = -1
    }

    def main(args: Array[String]): Unit = {

        val p = new Person()
        p.name = "liuyingdi"
        p.age = 18
        println(p.name, p.age)
    }
}