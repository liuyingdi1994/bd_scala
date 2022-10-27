package com.immoc.demo_01

object Demo06 {

    def main(args: Array[String]): Unit = {

        var numbers = for (number <- 1 to 10 if number % 2 == 0) yield number * number
        println(numbers)
    }
}
