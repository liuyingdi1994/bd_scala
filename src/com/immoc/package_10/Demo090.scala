package com.immoc.package_10

import scala.io.Source

object Demo090 {

    def main(args: Array[String]): Unit = {

        var source = Source.fromFile("./data/090.txt")
        var items = source.mkString.split("\\s+").toList.map(_.toInt + 1)
        println(items)
        source.close()

        source = Source.fromURL("http://www.baidu.com")
        println(source.mkString)
        source.close()
    }
}
