package com.immoc.package_08

import scala.collection.{mutable, immutable}

/*
1. 定义一个可变集，包含以下元素: 1,2,3, 4
2. 添加元素5到可变集中
3. 添加元素6, 7, 8到可变集中
4. 从可变集中移除元素1
5. 从可变集中移除元素3, 5, 7
6. 打印结果.
 */
object Demo66 {

    def main(args: Array[String]): Unit = {
        var immutableSet = immutable.Set[Int](1, 2, 3, 4)
        immutableSet += 5
        println(immutableSet)
        immutableSet ++= Set[Int](6, 7, 8)
        println(immutableSet)
        immutableSet -= 1
        println(immutableSet)
        immutableSet --= Set[Int](3, 5, 7)
        println(immutableSet)

        println("====================")

        var mutableSet = mutable.Set[Int](1, 2, 3, 4)
        mutableSet += 5
        println(mutableSet)
        mutableSet ++= Set[Int](6, 7, 8)
        println(mutableSet)
        mutableSet -= 1
        println(mutableSet)
        mutableSet --= Set[Int](3, 5, 7)
        println(mutableSet)

        println("====================")
        println(immutableSet == mutableSet)
    }
}
