package com.immoc.package_08

/*
1. 创建一个集，包含以下元素：1,1,2,3,4,5
2. 获取集的大小, 并打印结果.
3. 遍历集，打印每个元素.
4. 删除元素1，生成新的集, 并打印.
5. 拼接另一个集Set(6, 7, 8), 生成新的集, 并打印.
6. 拼接一个列表List(6,7,8, 9), 生成新的集, 并打印.
 */
object Demo65 {

    def main(args: Array[String]): Unit = {

        var set = Set[Int](1, 2, 3, 1, 4, 5)
        println(set.size, set)

        for (item <- set) println(item)

        set -= 1
        println(set)

        set ++= Set[Int](5, 6, 7, 8)
        println(set)

        set ++= List[Int](6, 7, 8, 9)
        println(set)
    }
}
