package com.immoc.demo_04

object Demo18 {

    class Person(var name: String, var age: Int) {

        def printInfo(): Unit = {
            print(s"my name is ${this.name}, i'm ${this.age} years old")
        }
    }

    def main(args: Array[String]): Unit = {
        var p1 = new Person("Alice", 18)
        p1.printInfo()
    }
}