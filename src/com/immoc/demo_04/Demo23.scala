package com.immoc.demo_04

object Demo23 {

    class Generals(name: String) {

        def eat(): Unit = {
            println(s"${this.name} eat with ${Generals.tools}.")
        }
    }

    object Generals {
        var tools: String = "chopsticks"
    }

    def main(args: Array[String]): Unit = {
        var g = new Generals("Alice")
        g.eat()
    }
}
