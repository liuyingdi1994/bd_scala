package com.immoc.package_09

/*
1. 定义一个列表，包含以下元素：1, 2, 3, 4
2. 使用reduce计算所有元素的和
 */
object Demo79 {

    def main(args: Array[String]): Unit = {

        var items = (1 to 4).toList

        var result1 = items.reduce(_ - _)
        println(result1)

        var result2 = items.reduceLeft(_ - _)
        println(result2)

        var result3 = items.reduceRight(_ - _)
        println(result3)
    }
}
