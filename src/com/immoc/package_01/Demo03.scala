package com.immoc.package_01

import scala.io.StdIn

object Demo03 {

    def main(args: Array[String]): Unit = {

        print("please input your age: ")
        var age: Int = StdIn.readInt()
        var status = if (age < 18) {
            println("login failed.")
            -1
        } else {
            println("login succeed.")
            1
        }
        println(s"status=${status}")
    }
}
