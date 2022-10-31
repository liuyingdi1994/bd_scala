package com.immoc.package_05

object Demo28 {

    class Person() {
        var name: String = _

        def sayHello(): Unit = {
            println(s"Hello, ${this.name}!")
        }
    }

    object Student extends Person {

    }

    def main(args: Array[String]): Unit = {
        Student.name = "Alice"
        Student.sayHello()
    }
}
