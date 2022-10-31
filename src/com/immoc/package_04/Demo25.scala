package com.immoc.package_04

object Demo25 {

    class Person(name: String, age: Int) {

        def printInfo(): Unit = {
            println(s"name=${this.name}, age=${this.age}")
        }
    }

    object Person {
        def apply(name: String, age: Int): Person = {
            println("create a person object...")
            return new Person(name, age)
        }
    }

    def main(args: Array[String]): Unit = {

        var p1 = new Person("AAA", 18)
        p1.printInfo()

        var p2 = Person("BBB", 16)
        p2.printInfo()
    }
}
