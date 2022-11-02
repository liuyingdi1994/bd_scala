package com.immoc.package_10

import scala.io.StdIn

/*
1. 提示用户录入一个单词并接收.
2. 判断该单词是否能够匹配以下单词，如果能匹配，返回一句话
3. 打印结果.
hadoop 大数据分布式存储和计算框架
zookeeper 大数据分布式协调服务框架
spark 大数据分布式内存计算框架
其他 未匹配
 */
object Demo082 {

    def main(args: Array[String]): Unit = {

        print("please input a word: ")
        var input = StdIn.readLine()

        var result = input match {
            case "hadoop" => "大数据分布式存储和计算框架"
            case "zookeeper" => "大数据分布式协调服务框架"
            case "spark" => "大数据分布式内存计算框架"
            case _ => "未匹配"
        }
        println(result)
    }
}
