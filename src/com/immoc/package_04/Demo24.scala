package com.immoc.package_04

object Demo24 {

    class Generals(name: String) {

        private[this] def eat(): Unit = {
            println(s"${this.name} eat with ${Generals.tools}.")
        }
    }

    object Generals {
        var tools: String = "chopsticks"

        var g = new Generals("Alice")
        // g.eat() // error
    }

    def main(args: Array[String]): Unit = {
        var g = new Generals("Alice")
        // g.eat() // error
    }
}
