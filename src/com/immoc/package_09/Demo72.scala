package com.immoc.package_09

/*
1. 创建一个列表，包含元素1,2,3,4
2. 将上述的数字转换成对应个数的 * , 即: 1变为*, 2变为**, 以此类推.
 */
object Demo72 {

    def main(args: Array[String]): Unit = {

        var items1 = List(1, 2, 3, 4)

        var items2 = items1.map((item: Int) => "*" * item)
        println(items2)
        println("================")

        var items3 = items1.map(item => "*" * item)
        println(items3)
        println("================")

        var items4 = items1.map("*" * _)
        println(items4)
    }
}
