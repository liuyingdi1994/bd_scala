package com.immoc.demo_04

object Demo17 {

    class Person {
        private var name: String = _ /* default: null */

        private var age: Int = _ /* default: 0 */

        def sayHello(name: String): Unit = {
            print(s"${this.name} say hello to ${name}")
        }

        def getName: String = this.name

        def setName(name: String): Unit = this.name = name

        def getAge: Int = this.age

        def setAge(age: Int): Unit = this.age = age
    }

    def main(args: Array[String]): Unit = {

        val p = new Person()
        p.setName("liuyingdi")
        p.setAge(18)
        println(p.getName, p.getAge)
        p.sayHello("Alice")
    }
}