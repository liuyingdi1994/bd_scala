package com.immoc.package_10

import java.io.FileOutputStream

object Demo091 {

    def main(args: Array[String]): Unit = {

        val fos = new FileOutputStream("./data/091.txt")
        fos.write("好好学习\n".getBytes())
        fos.write("天天向上".getBytes())
        fos.close()
    }
}
