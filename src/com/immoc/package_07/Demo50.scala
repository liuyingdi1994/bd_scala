package com.immoc.package_07

import scala.collection.mutable.ArrayBuffer

object Demo50 {

    def main(args: Array[String]): Unit = {

        var items1 = new Array[Int](10)
        items1(0) = 11
        println(items1(0))

        var items2 = Array("java", "scala", "python")
        println(items2)
        println(items2.length)

        var items3 = new ArrayBuffer(0)
        var items4 = ArrayBuffer("hadoop", "storm", "spark")
        println(items3)
        println(items4)
    }
}
