package com.immoc.package_09

/*
1. 定义列表, 记录学生的成绩, 格式为: 姓名, 语文成绩, 数学成绩, 英语成绩, 学生信息如下: ("张三",37,90,100),
("李四",90,73,81), ("王五",60,90,76), ("赵六",59,21,72), ("田七",100,100,100)
2. 获取所有语文成绩在60分(含)及以上的同学信息.
3. 获取所有学生的总成绩.
4. 按照总成绩降序排列.
5. 打印结果.
 */
object Demo81 {

    def main(args: Array[String]): Unit = {

        var items = List(
            ("张三", 37, 90, 100),
            ("李四", 90, 73, 81),
            ("王五", 60, 90, 76),
            ("赵六", 59, 21, 72),
            ("田七", 100, 100, 100)
        )
        var list1 = items.filter(item => item._2 >= 60)
        println(list1)

        var list2 = items.map(item => item._1 -> (item._2 + item._3 + item._4))
        println(list2)

        var list3 = items.sortWith(
            (item1, item2) => item1._2 + item1._3 + item1._4 > item2._2 + item2._3 + item2._4
        )
        println(list3)
    }
}
