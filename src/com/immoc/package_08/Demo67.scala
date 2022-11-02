package com.immoc.package_08

/*
1. 定义一个映射，包含以下学生姓名和年龄数据: 张三 -> 23, 李四 -> 24, 李四 -> 40
2. 打印结果.
 */
object Demo67 {

    def main(args: Array[String]): Unit = {
        var map1 = Map(1 -> "Alice", 2 -> "Bob", 3 -> "Cindy")
        println(map1)

        var map2 = Map((1, "Alice"), (2, "Bob"), (3, "Cindy"))
        println(map2)

        // map2(1) = "A"; // error
    }
}
