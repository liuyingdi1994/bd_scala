package com.immoc.package_07

import scala.collection.mutable.ListBuffer

/*
1. 定义一个可变列表包含以下元素：1,2,3
2. 获取第一个元素, 并打印结果到控制台.
3. 添加一个新的元素：4
4. 追加一个列表，该列表包含以下元素：5,6,7
5. 删除元素7
6. 删除元素3, 4
7. 将可变列表转换为不可变列表
8. 将可变列表转换为数组
9. 打印结果.
 */
object Demo58 {

    def main(args: Array[String]): Unit = {
        var items = ListBuffer[Int](1, 2, 3)
        println(items(0))

        items += 4 ++= List(5, 6, 7) ++= ListBuffer[Int](8, 9) -= 7 --= List(3, 4)
        println(items) // ListBuffer(1, 2, 5, 6, 8, 9)

        var itemsList = items.toList
        println(itemsList) // List(1, 2, 5, 6, 8, 9)

        var itemsArray = itemsList.toArray
        for (item <- itemsArray) println(item)
    }
}
