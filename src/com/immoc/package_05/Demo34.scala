package com.immoc.package_05

object Demo34 {

    abstract class Animal {
        var name: String = _
        var age: Int = _

        def run(): Unit = println("Animal.run()")

        def eat(): Unit
    }

    class Cat(name: String, age: Int) extends Animal {
        override def eat(): Unit = println(s"${this.name} likes to eat fish")

        def catchMouse(): Unit = println(s"${this.name}Cat likes to catch mouse")
    }

    class Dog(name: String, age: Int) extends Animal {
        override def eat(): Unit = println(s"${this.name} likes to eat meat")

        def lookHome(): Unit = println(s"${this.name} can look home")
    }

    def main(args: Array[String]): Unit = {
        var animal: Animal = new Dog("mimi", 3)
        animal.run()
        animal.eat()
        if (animal.getClass == classOf[Cat]) {
            var cat = animal.asInstanceOf[Cat]
            cat.catchMouse()
        } else if (animal.getClass == classOf[Dog]) {
            var dog = animal.asInstanceOf[Dog]
            dog.lookHome()
        } else {
            println("not a cat or dog")
        }
    }
}
