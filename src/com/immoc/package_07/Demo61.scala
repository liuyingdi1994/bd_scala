package com.immoc.package_07

/*
1. 定义列表names, 保存三个学生的姓名，分别为：张三、李四、王五
2. 定义列表ages, 保存三个学生的年龄，分别为：23, 24, 25
3. 使用zip将列表names和ages, 组合成一个元素为元组的列表list1
4. 使用unzip将列表list1拆解成包含两个列表的元组tuple1
5. 打印结果
 */
object Demo61 {

    def main(args: Array[String]): Unit = {
        var names = List("Alice", "Bob", "Cindy")
        var ages = List(17, 18, 19)

        var list = names.zip(ages)
        println(list)

        var tuple = list.unzip
        println(tuple)

        println(tuple._1 == names, tuple._2 == ages)
    }
}
