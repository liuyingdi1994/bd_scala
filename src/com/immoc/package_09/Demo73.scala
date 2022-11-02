package com.immoc.package_09

/*
1. 有一个包含了若干个文本行的列表："hadoop hive spark flink flume", "kudu hbase sqoop storm"
2. 获取到文本行中的每一个单词，并将每一个单词都放到列表中.
 */
object Demo73 {

    def main(args: Array[String]): Unit = {

        var items = List("hadoop hive spark flink flume", "kudu hbase sqoop storm")

        var items2 = items.map(_.split(" "))
        println(items2)
        var items3 = items2.flatten
        println(items3)
        println("==================")

        var items4 = items.flatMap(_.split(" "))
        println(items4)
    }
}
