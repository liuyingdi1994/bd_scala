package com.immoc.package_10

/*
1. 创建两个样例类Customer(包含姓名, 年龄字段), Order(包含id字段)
2. 分别定义两个样例类的对象，并指定为Any类型
3. 使用模式匹配这两个对象，并分别打印它们的成员变量值
 */
object Demo085 {

    case class Customer(var name: String, var age: Int)

    case class Order(var id: String)

    def main(args: Array[String]): Unit = {
        var c: Any = Customer("Alice", 18)
        var o: Any = Order("202211020001")
        var s: Any = Set(1, 2, 3)

        c match {
            case Customer(name, age) => println(name, age)
            case Order(id) => println(id)
            case _ => println("matching failed")
        }
    }
}
