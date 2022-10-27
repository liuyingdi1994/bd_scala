package com.immoc.demo_01

object Demo05 {

    def main(args: Array[String]): Unit = {

        var sum: Int = 0
        for (number <- 1 to 10 if number % 3 == 0) {
            sum += number
        }
        println(sum)
    }
}
