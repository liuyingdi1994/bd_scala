package com.immoc.package_09

/*
1. 有一个列表，包含以下元素：2,3,1,6,4,5
2. 使用sortWith对列表进行降序排序
 */
object Demo77 {

    def main(args: Array[String]): Unit = {
        var items = List(2, 3, 1, 6, 4, 5)

        var items2 = items.sortWith((x, y) => x > y)
        println(items2)

        var items3 = items.sortWith(_ > _)
        println(items3)
    }
}
