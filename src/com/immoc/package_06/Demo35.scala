package com.immoc.package_06

import java.text.SimpleDateFormat
import java.util.Date

object Demo35 {

    trait Logger {
        def log(msg: String): Unit
    }

    class LogWriter extends Logger {
        override def log(msg: String): Unit = println(msg)
    }

    def main(args: Array[String]): Unit = {
        var writer = new LogWriter()
        writer.log(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))
    }
}
