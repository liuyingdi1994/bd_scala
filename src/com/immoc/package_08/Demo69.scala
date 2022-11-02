package com.immoc.package_08

import scala.collection.{immutable, mutable}

/*
1. 定义一个映射，包含以下学生姓名和年龄数据: 张三 -> 23, 李四 -> 24
2. 获取张三的年龄, 并打印.
3. 获取所有的学生姓名, 并打印.
4. 获取所有的学生年龄, 并打印.
5. 打印所有的学生姓名和年龄.
6. 获取 王五 的年龄，如果 王五 不存在，则返回-1, 并打印.
7. 新增一个学生：王五, 25, 并打印结果.
8. 将 李四 从可变映射中移除, 并打印.
 */
object Demo69 {

    def main(args: Array[String]): Unit = {
        var map = mutable.Map(("Alice", 23), ("Bob", 24))
        println(map("Alice"))
        println(map.keys)
        println(map.values)

        for ((key, value) <- map) println(key, value)

        println(map.get("Cindy"))
        println(map.getOrElse("Cindy", -1))

        map.put("Cindy", 25)
        println(map)

        map.remove("Bob")
        println(map)
    }
}
