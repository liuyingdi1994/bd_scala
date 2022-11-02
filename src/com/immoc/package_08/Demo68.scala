package com.immoc.package_08

import scala.collection.{mutable, immutable}

object Demo68 {

    def main(args: Array[String]): Unit = {

        var map1 = immutable.Map(1 -> "Alice", 2 -> "Bob", 3 -> "Cindy")
        println(map1)
        // map1(1) = "A" // Error

        var map2 = mutable.Map((1, "Alice"), (2, "Bob"), (3, "Cindy"))
        println(map2)
        map2(1) = "Apple"
        println(map2)
    }
}
