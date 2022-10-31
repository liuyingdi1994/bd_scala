package com.immoc.package_05

object Demo33 {

    abstract class Person {

        def sayHello(): Unit
    }

    def show(p: Person): Unit = p.sayHello()

    def main(args: Array[String]): Unit = {
        var p = new Person {
            override def sayHello(): Unit = {
                println("Hello Scala!")
            }
        }

        show(p)
    }
}
