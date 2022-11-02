package com.immoc.package_10

/*
1. 找出以下列表中的所有不合法的邮箱.
2. "38123845@qq.com", "a1da88123f@gmail.com", "zhansan@163.com", "123afadff.com"
 */
object Demo088 {

    def main(args: Array[String]): Unit = {
        var emails = List(
            "38123845@qq.com",
            "a1da88123f@gmail.com",
            "zhansan@163.com",
            "123afadff.com"
        )
        var regex = """.+@.+\..+""".r

        var validEmails = emails.filter(regex.findAllMatchIn(_).size > 0)
        println(validEmails)
    }
}
