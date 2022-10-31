package com.immoc.package_02

object Demo11 {

    def main(args: Array[String]): Unit = {
        /* 1. 后缀调用法 */
        println(Math.pow(2, 3))
        /* 2. 中缀调用法 */
        println(Math pow(2, 3))
        println(2 * 3)
        println(1 to 10)
        /* 3. 花括号调用法（限制：方法只需要一个参数） */
        var a = Math.abs {
            println("Math.abs")
            -20
        }
        println(a)
        /* 4. 无括号调用法（限制：方法没有参数） */
        sayHello()
    }

    def sayHello(): Unit = {
        println("Hello Scala!")
    }
}
