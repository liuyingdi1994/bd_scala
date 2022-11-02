package com.immoc.package_09

/*
1. 定义一个列表，包含以下元素: 3, 1, 2, 9, 7
2. 对列表进行升序排序
3. 对列表进行降序排列.
 */
object Demo75 {

    def main(args: Array[String]): Unit = {

        var items = List(3, 1, 2, 9, 7)

        var items2 = items.sorted
        println(items2)
        println("================")

        var items3 = items.sorted.reverse
        println(items3)
    }
}
