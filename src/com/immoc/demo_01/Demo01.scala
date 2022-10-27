package com.immoc.demo_01

import scala.io.StdIn

object Demo01 {

    def main(args: Array[String]): Unit = {

        print("please input your name: ")
        var name: String = StdIn.readLine()
        print("please input your age: ")
        var age: Int = StdIn.readInt()

        println(s"my name is ${name}, i'm ${age} years old.")
    }
}
