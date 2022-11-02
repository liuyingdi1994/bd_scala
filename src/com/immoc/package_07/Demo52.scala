package com.immoc.package_07

/*
1. 定义一个数组，包含以下元素1,2,3,4,5
2. 通过两种遍历方式遍历数组，并打印数组中的元素
 */
object Demo52 {

    def main(args: Array[String]): Unit = {
        var items = Array(1, 2, 3, 4, 5)

        for (index <- 0 until items.length) {
            println(items(index))
        }

        for (item <- items) println(item)
    }
}
