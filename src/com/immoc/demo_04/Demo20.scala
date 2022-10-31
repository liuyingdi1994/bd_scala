package com.immoc.demo_04

object Demo20 {

    object Dog {

        var legs = 0
    }

    def main(args: Array[String]): Unit = {
        println(Dog.legs)
        Dog.legs += 1
        println(Dog.legs)
    }
}