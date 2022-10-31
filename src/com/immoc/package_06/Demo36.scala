package com.immoc.package_06

object Demo36 {

    trait MessageSender {
        def send(msg: String): Unit
    }

    trait MessageReceiver {
        def receive(): Unit
    }

    class MessageWorker extends MessageSender with MessageReceiver {
        override def send(msg: String): Unit = println(s"send: ${msg}")

        override def receive(): Unit = println("get it")
    }

    def main(args: Array[String]): Unit = {
        var worker = new MessageWorker()
        worker.send("nice to meet u")
        worker.receive()
    }
}
