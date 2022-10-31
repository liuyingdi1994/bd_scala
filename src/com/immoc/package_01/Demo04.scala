package com.immoc.package_01

object Demo04 {

    def main(args: Array[String]): Unit = {

        for (p <- 1 until 10; q <- 1 to p) {
            print(s"${q} * ${p} = ${p * q}\t")
            if (p == q) {
                println()
            }
        }
    }
}
