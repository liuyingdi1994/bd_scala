package com.immoc.package_10

/*
1. 依次修改代码定义以下三个数组
Array(1,x,y) // 以1开头，后续的两个元素不固定
Array(0) // 只匹配一个0元素的元素
Array(0, ...) // 可以任意数量，但是以0开头
2. 使用模式匹配, 匹配上述数组.
 */
object Demo086 {

    def main(args: Array[String]): Unit = {

        var a1 = Array(1, 2, 3)
        var a2 = Array(0)
        var a3 = Array(0, 1, 2, 3, 4)
        var a4 = Array(4, 5, 6, 7, 8)

        a4 match {
            // 匹配: 长度为3, 首元素为1, 后两个元素无所谓.
            case Array(1, _, _) => println("1")

            // 匹配: 只有一个0元素的数组
            case Array(0) => println("2")

            // 匹配: 第一个元素是1, 后边元素无所谓的数组.
            case Array(0, _*) => println("3")

            case Array(_, _, 6, _*) => println("4")

            case _ => println("0")
        }
    }
}
