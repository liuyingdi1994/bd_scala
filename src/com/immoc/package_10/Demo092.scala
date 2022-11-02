package com.immoc.package_10

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

object Demo092 {

    case class Person(var name: String, var age: Int)

    def main(args: Array[String]): Unit = {
        var items = List(Person("Alice", 18), Person("Bob", 20), Person("Cindy", 8))

        /* 序列化 */
        var fos = new FileOutputStream("./data/092.txt")
        var oos = new ObjectOutputStream(fos)
        oos.writeObject(items)
        oos.close()
        fos.close()

        /* 反序列化 */
        var fis = new FileInputStream("./data/092.txt")
        var ois = new ObjectInputStream(fis)
        var items2 = ois.readObject()
        println(items2)
        ois.close()
        fis.close()
    }
}
