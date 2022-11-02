package com.immoc.package_07

/*
1. 定义一个元组，包含学生的姓名和年龄.
2. 分别使用小括号以及箭头的方式来定义元组.
 */
object Demo54 {

    def main(args: Array[String]): Unit = {
        var s1 = ("Alice", 18)
        println(s1)

        var s2 = "Alice" -> 18
        println(s2)
    }
}
