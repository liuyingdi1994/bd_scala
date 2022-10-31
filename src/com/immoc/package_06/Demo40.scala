package com.immoc.package_06

object Demo40 {

    trait playLoL {
        def top(): Unit

        def jungle(): Unit

        def mid(): Unit

        def adc(): Unit

        def support(): Unit

        def schoolchild(): Unit
    }

    abstract class Player extends playLoL {
        override def top(): Unit = {}

        override def jungle(): Unit = {}

        override def mid(): Unit = {}

        override def adc(): Unit = {}

        override def support(): Unit = {}

        override def schoolchild(): Unit = {}
    }

    class GreenHand extends Player {
        override def support(): Unit = println("GreenHand.support()")

        override def schoolchild(): Unit = println("GreenHand.schoolchild()")
    }

    def main(args: Array[String]): Unit = {
        var player = new GreenHand
        player.support()
        player.schoolchild()
    }
}
