package com.immoc.package_06

import java.text.SimpleDateFormat
import java.util.Date

object Demo39 {

    trait Logger {
        def log(msg: String): Unit = println(s"${new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())}: ${msg}")
    }

    class User

    def main(args: Array[String]): Unit = {
        var user = new User with Logger
        user.log("login success")
    }
}
