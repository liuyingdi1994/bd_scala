package com.immoc.package_06

object Demo46 {

    abstract class Programmer {
        var name: String = _
        var age: Int = _

        def eat()

        def skill()
    }

    class PythonProgrammer extends Programmer {
        override def eat(): Unit = println("PythonProgrammer.eat()")

        override def skill(): Unit = println("PythonProgrammer.skill()")
    }

    class JavaProgrammer extends Programmer {
        override def eat(): Unit = println("JavaProgrammer.eat()")

        override def skill(): Unit = println("JavaProgrammer.skill()")
    }

    trait BigData {
        def hadoop(): Unit = println("BigData.hadoop()")
    }

    class PythonBigDataProgrammer extends PythonProgrammer with BigData {
        override def skill(): Unit = {
            super.skill()
            super.hadoop()
        }
    }

    class JavaBigDataProgrammer extends JavaProgrammer with BigData {
        override def skill(): Unit = {
            super.skill()
            super.hadoop()
        }
    }

    def main(args: Array[String]): Unit = {
        var p = new PythonProgrammer
        p.eat()
        p.skill()
        println("-------------------------")
        var j = new JavaProgrammer
        j.eat()
        j.skill()
        println("-------------------------")
        var pbd = new PythonBigDataProgrammer
        pbd.eat()
        pbd.skill()
        println("-------------------------")
        var jbd = new JavaBigDataProgrammer
        jbd.eat()
        jbd.skill()
    }
}
