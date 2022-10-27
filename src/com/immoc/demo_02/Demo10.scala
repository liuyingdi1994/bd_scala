package com.immoc.demo_02

object Demo10 {

    def main(args: Array[String]): Unit = {
        println(sum(1, 2, 3, 4))
    }

    def sum(nums: Int*): Int = {
        var total = 0
        for (number <- nums) {
            total += number
        }
        return total
    }
}
