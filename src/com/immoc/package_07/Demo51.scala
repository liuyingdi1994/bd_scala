package com.immoc.package_07

import scala.collection.mutable.ArrayBuffer

/*
1. 定义一个变长数组，包含以下元素: "hadoop", "spark", "flink"
2. 往该变长数组中添加一个"flume"元素
3. 从该变长数组中删除"hadoop"元素
4. 将一个包含"hive", "sqoop"元素的数组, 追加到变长数组中.
5. 从该变长数组中删除"sqoop", "spark"这两个元素.
6. 打印数组, 查看结果.
 */
object Demo51 {

    def main(args: Array[String]): Unit = {
        var items = ArrayBuffer("hadoop", "spark", "hadoop", "flink")

        items += "flume"
        println(items)

        items -= "hadoop"
        println(items)

        items ++= Array("hive", "sqoop")
        println(items)

        items --= Array("sqoop", "spark")
        println(items)
    }
}
