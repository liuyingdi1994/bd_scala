package com.immoc.package_10

/*
1. 定义一个变量为Any类型，然后分别给其赋值为"hadoop"、1、1.0
2. 定义模式匹配，然后分别打印类型的名称
 */
object Demo083 {

    def main(args: Array[String]): Unit = {

        var variable: Any = "hadoop";
        variable match {
            case _: Int => println("Int")
            case _: Double => println("Double")
            case _: String => println("String")
            case _ => println("matching failed")
        }
    }
}
