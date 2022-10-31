package com.immoc.package_05

object Demo27 {

    class Person() {
        var name: String = _
        var age: Int = _

        def this(name: String, age: Int) {
            this()
            this.name = name
            this.age = age
        }

        def eat(): Unit = {
            println(s"${this.name} is eating.")
        }

        def printInfo(): Unit = {
            println(s"name=${this.name}, age=${this.age}")
        }
    }

    class Student extends Person {
        var sno: String = _

        def this(name: String, age: Int, sno: String) {
            this()
            this.name = name
            this.age = age
            this.sno = sno
        }
    }

    class Teacher extends Person {
        var tno: String = _

        def this(name: String, age: Int, tno: String) {
            this()
            this.name = name
            this.age = age
            this.tno = tno
        }
    }

    def main(args: Array[String]): Unit = {
        var p = new Person("Person", 18)
        p.printInfo()
        var s = new Student("Student", 16, "0001")
        s.printInfo()
        var t = new Student("Teacher", 36, "0002")
        t.printInfo()
    }
}
