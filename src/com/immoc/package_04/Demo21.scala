package com.immoc.package_04

object Demo21 {

    object PrintUtils {

        def splitLine(operator: String, length: Int): Unit = println(operator * length)
    }

    def main(args: Array[String]): Unit = {
        PrintUtils.splitLine("-", 20)
    }
}