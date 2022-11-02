package com.immoc.package_07

import scala.collection.mutable.ListBuffer

/*
1. 创建空的整型可变列表.
2. 创建一个可变列表，包含以下元素：1,2,3,4
 */
object Demo57 {

    def main(args: Array[String]): Unit = {
        var items1 = ListBuffer[Int]()
        println(items1)

        var items2 = ListBuffer[Int](3, 1, 4, 1, 5)
        println(items2)
    }
}
