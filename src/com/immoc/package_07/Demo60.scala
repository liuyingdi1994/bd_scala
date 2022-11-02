package com.immoc.package_07

import scala.collection.mutable.ListBuffer

/*
1. 定义一个列表, 该列表有三个元素, 分别为：List(1,2)、List(3)、List(4,5)
2. 使用flatten将这个列表转换为List(1,2,3,4,5)
3. 打印结果.
 */
object Demo60 {

    def main(args: Array[String]): Unit = {
        var matrix = ListBuffer[ListBuffer[Int]](
            ListBuffer(1, 2),
            ListBuffer(3),
            ListBuffer(4, 5)
        )
        println(matrix)

        var vector = matrix.flatten
        println(vector)
    }
}
