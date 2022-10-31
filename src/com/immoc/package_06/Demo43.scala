package com.immoc.package_06

object Demo43 {

    trait Logger {
        println("Logger")
    }

    trait MyLogger extends Logger {
        println("MyLogger")
    }

    trait TimeLogger extends Logger {
        println("TimeLogger")
    }

    class Person {
        println("Person")
    }

    class Student extends Person with MyLogger with TimeLogger {
        println("Student")
    }

    def main(args: Array[String]): Unit = {
        var s: Student = new Student
    }
}
