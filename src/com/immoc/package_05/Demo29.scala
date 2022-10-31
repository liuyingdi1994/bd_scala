package com.immoc.package_05

object Demo29 {

    class Person() {
        val CLASS_NAME = "PERSON"
        var name: String = _
        var age: Int = _

        def sayHello(): Unit = {
            println(s"Hello, Person ${this.name}!")
        }
    }

    class Student extends Person {
        override val CLASS_NAME = "STUDENT"

        override def sayHello(): Unit = {
            println(s"Hello, Student ${this.name}!")
        }

    }

    def main(args: Array[String]): Unit = {
        var s = new Student()
        s.name = "Alice"
        s.age = 18
        s.sayHello()
        println(s.CLASS_NAME)
    }
}
