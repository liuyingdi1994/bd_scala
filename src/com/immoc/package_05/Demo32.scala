package com.immoc.package_05

object Demo32 {

    abstract class Shape {
        val PI: Double = Math.PI

        val SHAPE: String

        def area(): Double
    }

    class Square(edge: Double) extends Shape {

        override val SHAPE: String = "SQUARE"

        override def area(): Double = Math.pow(edge, 2)
    }

    class Rectangle(length: Double, width: Double) extends Shape {

        override val SHAPE: String = "RECTANGLE"

        override def area(): Double = length * width
    }

    class Circle(radius: Double) extends Shape {

        override val SHAPE: String = "CIRCLE"

        override def area(): Double = PI * Math.pow(this.radius, 2)
    }

    def main(args: Array[String]): Unit = {
        var s = new Square(edge = 4)
        println(s.SHAPE, s.area())
        var r = new Rectangle(width = 4, length = 3)
        println(r.SHAPE, r.area())
        var c = new Circle(radius = 2.0)
        println(c.SHAPE, c.area())
    }
}
