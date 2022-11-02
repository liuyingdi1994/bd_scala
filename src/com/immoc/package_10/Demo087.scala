package com.immoc.package_10

/*
1. 定义一个字符串, 表示邮箱.
2. 定义一个正则表达式，来匹配邮箱是否合法.
3. 合法邮箱测试：qq12344@163.com
4. 不合法邮箱测试：qq12344@.com
5. 打印结果.
 */
object Demo087 {

    def main(args: Array[String]): Unit = {
        var email = "qq12344@163.com"
        var regex = """.+@.+\..+""".r
        println(regex.findAllMatchIn(email).size > 0)
    }
}
