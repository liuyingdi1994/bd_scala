package com.immoc.package_07

/*
1. 定义一个元组，包含一个学生的姓名和性别，"zhangsan", "male"
2. 分别获取该学生的姓名和性别, 并将结果打印到控制台上.
 */
object Demo55 {

    def main(args: Array[String]): Unit = {
        var s = ("zhangsan", "male")
        println(s._1, s._2)

        for(item <- s.productIterator) println(item)
    }
}
