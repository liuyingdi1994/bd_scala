package com.immoc.demo_04

object Demo19 {

    class Customer(var name: String, var address: String) {

        def this(items: Array[String]) = {
            this(items(0), items(1))
        }

        def printInfo(): Unit = {
            print(s"${this.name}\t${this.address}")
        }
    }

    def main(args: Array[String]): Unit = {
        var c = new Customer("Donny", "Beijing")
        c.printInfo()
    }
}