package com.immoc.package_02

import scala.util.control.Breaks._

object Demo08 {

    def main(args: Array[String]): Unit = {
        println("step 1")
        lazy val z = sum(10, 20) // 惰性执行方法
        println("step 2")
        println(z) // 此时才会真正地执行sum方法
        println("step 4")
    }

    def max(x: Int, y: Int): Int = {
        return if (x >= y) x else y
    }

    def factorial(number: Int): Int = if (number == 1) 1 else number * factorial(number - 1)

    def sum(x: Int, y: Int): Int = {
        println("step 3")
        return x + y
    }
}
