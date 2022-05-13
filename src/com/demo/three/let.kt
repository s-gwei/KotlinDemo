package com.demo.three

// TODO 37.在Kotlin中使用带let的安全调用
fun main() {
    var name: String? = null
    name = "Derry"
//    name = ""


    // name是可空类型的 如果真的是null，?后面这一段代码不执行，就不会引发空指针异常
    //let代码最后一行为返回值，
    val r =name?.let {
        println(it)
        "sungw"
        true
        11111
        1.1
        '1'
    }
    println(r)
}