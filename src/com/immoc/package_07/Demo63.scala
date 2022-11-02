package com.immoc.package_07

/*
1. 定义列表list1，包含以下元素：1,2,3,4
2. 定义列表list2，包含以下元素：3,4,5,6
3. 使用union获取这两个列表的并集
4. 在第三步的基础上, 使用distinct去除重复的元素
5. 使用intersect获取列表list1和list2的交集
6. 使用diff获取列表list1和list2的差集
7. 打印结果
 */
object Demo63 {

    def main(args: Array[String]): Unit = {

        var list1 = List(1, 2, 3, 4)
        var list2 = List(3, 4, 5, 6)

        println(list1.union(list2))
        println(list1.union(list2).distinct)
        println(list1.intersect(list2))
        println(list1.diff(list2))
    }
}
