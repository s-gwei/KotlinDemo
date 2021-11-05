package com.sun.four

// TODO 40.在Kotlin空合并操作符
//?:如果前置参数为null，则后面的代码执行，如果前面的参数部位null，则后置代码不执行,前置代码执行
//相当于java中的 a=null? 1 : 2
fun main() {
    var info: String? = "李小龙"
     info = null
     var str = info ?: "info为null，所以我执行了"
    println(str)
     // 空合并操作符  xxx ?: "原来你是null啊"    "如果xxx等于null，就会执行 ?: 后面的区域"
    println( info ?: "原来你是null啊" )


    // let函数 + 空合并操作符
    println(info?.let { "【$it】" } ?: "原来你是null啊2")
}