package com.immoc.package_06

object Demo44 {

    trait F {
        println("F Constructor")
    }

    trait C {
        println("C Constructor")
    }

    trait D extends F {
        println("D Constructor")
    }

    trait E extends F {
        println("E Constructor")
    }

    class B {
        println("B Constructor")
    }

    class A extends B with C with D with E {
        println("A Constructor")
    }

    def main(args: Array[String]): Unit = {
        var a: A = new A
    }
}
