package com.immoc.package_10

import java.io.{BufferedWriter, FileWriter}
import scala.collection.mutable.ListBuffer
import scala.io.Source

/*
1. 已知项目下的data文件夹的student.txt文本文件中, 记录了一些学员的成绩, 如下:
格式为: 姓名 语文成绩 数学成绩 英语成绩
2. 按照学员的总成绩降序排列后, 按照 姓名 语文成绩 数学成绩 英语成绩 总成绩 的格式, 将数据写到项目下的
data文件夹的stu.txt文件中.
 */
object Demo093 {

    case class Student(name: String, chinese: Int, math: Int, english: Int) {
        def sum() = chinese + math + english
    }


    def main(args: Array[String]): Unit = {

        var source = Source.fromFile("./data/093_in.txt")
        var lines = source.getLines().toList.map(line => line.split(" ").toList)
        source.close()

        var slb = ListBuffer[Student]()
        for (line <- lines) slb += Student(line(0), line(1).toInt, line(2).toInt, line(3).toInt)
        var sl = slb.sortBy(_.sum()).reverse.toList

        var bw = new BufferedWriter(new FileWriter("./data/093_out.txt"))
        for (s <- sl) bw.write(s"${s.name} ${s.chinese} ${s.math} ${s.english} ${s.sum()}\n")
        bw.close()
    }
}
