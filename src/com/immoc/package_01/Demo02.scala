package com.immoc.package_01

object Demo02 {

    def main(args: Array[String]): Unit = {

        var str1: String = "abc"
        var str2: String = "abc"
        var str3: String = "ab"
        var str4: String = "c"
        var str5: String = str3 + str4
        println(str1 == str2) // true
        println(str1.eq(str2)) // true
        println(str1 == str5) // true
        println(str1.eq(str5)) // false Scala中 == 比较value，eq比较address
    }
}
