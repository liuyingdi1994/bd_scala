package com.immoc.package_05

object Demo30 {

    class Person() {
        var name: String = _

        def sayHello(): Unit = {
            println(s"Hello, Person:${this.name}!")
        }
    }

    class Student extends Person {
        override def sayHello(): Unit = {
            println(s"Hello, Student:${this.name}!")
        }

        def study(): Unit = {
            println(s"${this.name} is studying")
        }
    }

    class Teacher extends Person {
        override def sayHello(): Unit = {
            println(s"Hello, Teacher:${this.name}!")
        }

        def teach(): Unit = {
            println(s"${this.name} is teaching")
        }
    }

    def main(args: Array[String]): Unit = {
        var p: Person = new Teacher()
        p.name = "Alice"
        if (p.isInstanceOf[Student]) {
            var s: Student = p.asInstanceOf[Student]
            s.study()
        } else if (p.isInstanceOf[Teacher]) {
            var t: Teacher = p.asInstanceOf[Teacher]
            t.teach()
        } else {
            p.sayHello()
        }
    }
}
