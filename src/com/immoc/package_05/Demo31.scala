package com.immoc.package_05

object Demo31 {

    class Person

    class Student extends Person

    def main(args: Array[String]): Unit = {
        var p: Person = new Student()
        println(p.isInstanceOf[Person]) // true
        println(p.isInstanceOf[Student]) // true

        println(p.getClass == classOf[Person]) // false
        println(p.getClass == classOf[Student]) // true
    }
}
