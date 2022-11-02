package com.immoc.package_07

object Demo49 {

    case class Calculator(a: Int, b: Int) {
        def add(): Int = a + b

        def sub(): Int = a - b

        def mul(): Int = a * b

        def div(): Int = a / b
    }

    def main(args: Array[String]): Unit = {

        var calculator = Calculator(10, 20)
        println(calculator.add())
        println(calculator.sub())
        println(calculator.mul())
        println(calculator.div())
    }
}
