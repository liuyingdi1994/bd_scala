package com.immoc.package_07

import scala.collection.mutable.ListBuffer


/*
1. 定义一个列表list1，包含以下元素：1,2,3,4
2. 使用isEmpty方法判断列表是否为空, 并打印结果.
3. 再定义一个列表list2，包含以下元素: 4,5,6
4. 使用 ++ 将两个列表拼接起来, 并打印结果.
5. 使用head方法，获取列表的首个元素, 并打印结果.
6. 使用tail方法，获取列表中除首个元素之外, 其他所有的元素, 并打印结果.
7. 使用reverse方法将列表的元素反转, 并打印反转后的结果.
8. 使用take方法获取列表的前缀元素, 并打印结果.
9. 使用drop方法获取列表的后缀元素, 并打印结果.
 */
object Demo59 {

    def main(args: Array[String]): Unit = {

        var list1 = ListBuffer[Int](1, 2, 3, 4)
        println(list1.isEmpty)

        var list2 = ListBuffer[Int](4, 5, 6)
        println(list1 ++ list2)

        println(list1.head, list2.head)
        println(list1.tail, list2.tail)
        println(list1.reverse, list2.reverse)
        println(list1.take(3), list1.drop(0))
    }
}
