package com.immoc.demo_02

object Demo12 {

    def main(args: Array[String]): Unit = {
        println(add(1, 2))
        val subFunction = sub _
    }

    val add: (Int, Int) => Int = (x: Int, y: Int) => x + y

    def sub(x: Int, y: Int): Int = x - y
}
