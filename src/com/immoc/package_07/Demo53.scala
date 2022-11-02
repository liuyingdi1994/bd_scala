package com.immoc.package_07

object Demo53 {

    def main(args: Array[String]): Unit = {
        var items = Array(4, 1, 6, 5, 2, 3)
        println(s"sum=${items.sum}")
        println(s"max=${items.max}")
        println(s"min=${items.min}")

        var itemsSorted = items.sorted
        for (item <- items) print(item + " ")
        println()
        println("===========")

        for (item <- itemsSorted) print(item + " ")
        println()
        println("===========")

        var itemsReverse = items.reverse
        for (item <- items) print(item + " ")
        println()
        println("===========")

        for (item <- itemsReverse) print(item + " ")
        println()
        println("===========")

    }
}
