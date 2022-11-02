package com.immoc.package_09

/*
1. 定义一个列表，包含以下元素：1,2,3
2. 假设初始化值是100, 使用fold方法计算所有元素的和.
 */
object Demo80 {

    def main(args: Array[String]): Unit = {

        var items = (1 to 3).toList
        var number = 100

        var result1 = items.fold(number)(_ - _)
        println(result1)

        var result2 = items.foldLeft(number)(_ - _)
        println(result2)

        var result3 = items.foldRight(number)(_ - _)
        println(result3)
    }
}
