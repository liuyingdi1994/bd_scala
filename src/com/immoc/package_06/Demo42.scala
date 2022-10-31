package com.immoc.package_06

object Demo42 {

    trait Handle {
        def handle(data: String): Unit = {
            println(s"具体的处理流程：${data}")
        }
    }

    trait DataValidHandler extends Handle {
        override def handle(data: String): Unit = {
            println("验证数据")
            super.handle(data)
        }
    }

    trait SignatureValidHandler extends Handle {
        override def handle(data: String): Unit = {
            println("检查签名")
            super.handle(data)
        }
    }

    class Payment extends DataValidHandler with SignatureValidHandler {
        def pay(data: String): Unit = {
            println("用户发起支付请求")
            super.handle(data)
        }
    }

    def main(args: Array[String]): Unit = {
        var demo = new Payment
        demo.pay("张三 => 李四: ￥1000")
    }
}
