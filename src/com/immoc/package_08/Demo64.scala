package com.immoc.package_08

/*
1. 定义一个空的整型不可变集.
2. 定义一个不可变集，保存以下元素：1,1,3,2,4,8.
3. 打印结果.
 */
object Demo64 {

    def main(args: Array[String]): Unit = {

        var set1 = Set[Int]()
        println(set1)

        var set2 = Set[Int](1, 3, 2, 4, 8, 1)
        println(set2)
    }
}
