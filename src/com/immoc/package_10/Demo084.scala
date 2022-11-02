package com.immoc.package_10

import scala.io.StdIn

/*
1. 从控制台读入一个数字a（使用StdIn.readInt）
2. 如果 a >= 0 而且 a <= 3，打印[0-3]
3. 如果 a >= 4 而且 a <= 8，打印[4,8]
4. 否则，打印未匹配
 */
object Demo084 {

    def main(args: Array[String]): Unit = {

        var number = StdIn.readInt()

        number match {
            case a if (a >= 0 && a <= 3) => println("[0, 3]")
            case a if (a >= 4 && a <= 8) => println("[4, 8]")
            case _ => println("matching failed")
        }
    }
}
