package com.immoc.demo_02

object Demo09 {

    def main(args: Array[String]): Unit = {
        println(sum(1, 2))
        println(sum())
        println(sum(x = 100))
        println(sum(y = 100))
    }

    def sum(x: Int = 10, y: Int = 20): Int = {
        return x + y
    }
}
