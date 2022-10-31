package com.immoc.package_06

object Demo45 {

    class Message {
        def printMsg(): Unit = println("学号Scala，走到哪里都不怕")
    }

    trait Logger extends Message

    class ConsoleLogger extends Logger

    def main(args: Array[String]): Unit = {
        var cl: ConsoleLogger = new ConsoleLogger
        cl.printMsg()
    }
}
