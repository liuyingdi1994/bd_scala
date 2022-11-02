package com.immoc.package_07

object Demo47 {

    case class Person(val name: String, var age: Int)

    def main(args: Array[String]): Unit = {
        var person = new Person("Alice", 18)
        println(person.name, person.age)
        // person.name = "Bob" // Error
        person.age = 19
    }
}
