package com.immoc.package_09

/*
有一个列表，包含以下元素1,2,3,4，请使用foreach方法遍历打印每个元素
 */
object Demo71 {

    def main(args: Array[String]): Unit = {

        var items = List(1, 2, 3, 4)

        items.foreach((item: Int) => println(item))
        println("===================")

        items.foreach(item => println(item))
        println("===================")

        items.foreach(println(_))
    }
}
