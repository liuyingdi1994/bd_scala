package com.immoc.package_06

import java.util.Date

object Demo41 {

    abstract class Template {
        def code(): Unit

        def getRuntime(): Long = {
            var startTime: Long = new Date().getTime
            code()
            var endTime: Long = new Date().getTime
            return endTime - startTime
        }
    }

    class ForDemo extends Template {
        override def code(): Unit = {
            for (_ <- 1 to 10000) {
                println("Hello Scala")
            }
        }
    }

    def main(args: Array[String]): Unit = {
        var demo = new ForDemo
        println(demo.getRuntime())
    }
}
