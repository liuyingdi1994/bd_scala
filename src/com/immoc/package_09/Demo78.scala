package com.immoc.package_09

/*
1. 有一个列表，包含了学生的姓名和性别: "刘德华" -> "男", "刘亦菲" -> "女", "胡歌" -> "男"
2. 请按照性别进行分组.
3. 统计不同性别的学生人数.
 */
object Demo78 {

    def main(args: Array[String]): Unit = {

        var items = List("刘德华" -> "男", "刘亦菲" -> "女", "胡歌" -> "男")

        var map1 = items.groupBy(item => item._2)
        println(map1)

        var map2 = map1.map(item => item._1 -> item._2.length)
        println(map2)
    }
}
