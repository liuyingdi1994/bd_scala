package com.immoc.demo_01

import scala.util.control.Breaks._

object Demo07 {

    def main(args: Array[String]): Unit = {

        /* break */
        breakable {
            for (number <- 1 to 5) {
                println(number)
                if (number == 3) {
                    break()
                }
            }
        }

        println("===========")

        /* continue */
        for (number <- 1 to 5) {
            breakable {
                if (number == 3) {
                    break()
                }
                println(number)
            }
        }
    }
}
