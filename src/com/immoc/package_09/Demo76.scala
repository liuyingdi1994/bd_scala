package com.immoc.package_09

/*
1. 有一个列表，分别包含几下文本行："01 hadoop", "02 flume", "03 hive", "04 spark"
2. 请按照单词字母进行排序
 */
object Demo76 {

    def main(args: Array[String]): Unit = {

        var items = List("01 hadoop", "02 flume", "03 hive", "04 spark")

        var items2 = items.sortBy(item => item.split(" ")(1))
        println(items2)
    }
}
