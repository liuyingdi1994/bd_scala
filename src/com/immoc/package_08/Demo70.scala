package com.immoc.package_08

/*
1. 定义一个列表，包含以下元素：1,2,3,4,5
2. 使用while循环和迭代器，遍历打印该列表.
 */
object Demo70 {

    def main(args: Array[String]): Unit = {
        var items = List(1, 2, 3, 4, 5)
        var iter = items.iterator
        while(iter.hasNext) println(iter.next())
    }
}
