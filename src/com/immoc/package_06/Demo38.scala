package com.immoc.package_06

object Demo38 {

    trait Hero {
        var name: String = _
        var arms: String

        def eat(): Unit = println("Hero.eat()")

        def war(): Unit
    }

    class Generals extends Hero {
        override var arms: String = "fighter"

        override def war(): Unit = println(s"Generals.war(${this.name}, ${this.arms})")
    }

    def main(args: Array[String]): Unit = {
        var g = new Generals
        g.name = "David"
        g.eat()
        g.war()
    }
}
