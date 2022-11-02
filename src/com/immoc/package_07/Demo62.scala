package com.immoc.package_07

/*
1. 定义一个列表，包含元素：1,2,3,4
2. 使用toString方法输出该列表的元素
3. 使用mkString方法, 用冒号将元素都拼接起来, 并打印结果.
 */
object Demo62 {

    def main(args: Array[String]): Unit = {

        var items = List(1, 2, 3, 4)
        println(items.toString())

        println(items.mkString(sep = ", "))
    }
}
