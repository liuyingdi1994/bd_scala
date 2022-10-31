package com.immoc.package_04

import java.text.SimpleDateFormat
import java.util.Date

object Demo26 {

    object DateUtils {

        val DEFAULT_FORMAT: String = "yyyy-MM-dd HH:mm:ss"

        def convertDate2String(date: Date, format: String = DEFAULT_FORMAT): String = {
            var sdf: SimpleDateFormat = new SimpleDateFormat(format)
            sdf.format(date)
        }

        def convertString2Date(date: String, format: String = DEFAULT_FORMAT): Date = {
            var sdf: SimpleDateFormat = new SimpleDateFormat(format)
            sdf.parse(date)
        }
    }

    def main(args: Array[String]): Unit = {

        println(DateUtils.convertDate2String(new Date()))
        println(DateUtils.convertString2Date("1994-04-03 13:15:05"))

        while(true) {
            println(DateUtils.convertDate2String(new Date()))
            Thread.sleep(1000)
        }
    }
}
