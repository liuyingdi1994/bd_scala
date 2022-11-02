package com.immoc.package_07

object Demo48 {

    trait Sex

    case object Male extends Sex

    case object Female extends Sex

    case class Person(name: String, sex: Sex)

    def main(args: Array[String]): Unit = {

        var p1 = Person("Alice", Female)
        var p2 = Person("Bob", Male)
    }
}
