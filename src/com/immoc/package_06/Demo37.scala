package com.immoc.package_06

import java.text.SimpleDateFormat
import java.util.Date

object Demo37 {

    trait Logger {
        def log(msg: String): Unit
    }

    trait Warning {
        def warn(msg: String): Unit
    }

    object ConsoleLogger extends Logger with Warning {
        override def log(msg: String): Unit = println(s"normal log: ${msg}")

        override def warn(msg: String): Unit = println(s"warning log: ${msg}")
    }

    def main(args: Array[String]): Unit = {
        ConsoleLogger.log(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))
        ConsoleLogger.warn("Error!")
    }
}
