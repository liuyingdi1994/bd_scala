package com.immoc.demo_02

import scala.io.StdIn

object Demo13 {

    def main(args: Array[String]): Unit = {
        print("please input a number: ")
        var number = StdIn.readInt();
        multiplyTable(number)
    }

    def multiplyTable(number: Int): Unit = {
        for (row <- 1 to number; col <- 1 to row) {
            print(s"${col} * ${row} = ${row * col}")
            if (col < row) print("\t") else println()
        }
    }
}
