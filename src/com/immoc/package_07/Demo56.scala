package com.immoc.package_07

object Demo56 {

    def main(args: Array[String]): Unit = {

        var items1 = List()
        println(items1)

        var items2 = Nil
        println(items2)

        var items3 = scala.collection.immutable.List(3, 1, 4, 1, 5)
        println(items3)

        var items4 = 1 :: 3 :: 5 :: 7 :: Nil
        println(items4)
    }
}
