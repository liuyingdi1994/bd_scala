package com.immoc.package_10

import scala.io.Source

/*
以行为单位读取该文本文件中的数据, 并打印结果.
 */
object Demo089 {

    def main(args: Array[String]): Unit = {

        var source = Source.fromFile("./data/089.txt", "UTF-8")
        var lines = source.getLines().toList
        source.close()
        
        for (line <- lines) println(line)
    }
}
