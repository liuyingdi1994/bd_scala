package com.immoc.package_02

import scala.io.StdIn

object Demo14 {

    def main(args: Array[String]): Unit = {
        print("please input a number: ")
        var number = StdIn.readInt();
        multiplyTable(number)
    }

    var multiplyTable: Int => Unit = (number: Int) => {
        for (row <- 1 to number; col <- 1 to row) {
            print(s"${col} * ${row} = ${row * col}")
            if (col < row) print("\t") else println()
        }
    }
}
