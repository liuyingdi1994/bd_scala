package com.immoc.package_09

/*
1. 有一个数字列表，元素为：1,2,3,4,5,6,7,8,9
2. 请过滤出所有的偶数
 */
object Demo74 {

    def main(args: Array[String]): Unit = {
        var items = (1 to 9).toList

        var items2 = items.filter(_ % 2 == 0)
        println(items2)
    }
}
