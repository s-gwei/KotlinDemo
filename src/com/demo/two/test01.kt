package com.demo.two

// TODO 40.在Kotlin空合并操作符
//?: 操作符和 !! 操作符不同
//?: 是如果为空就执行别的，相当于if判断， ！！是即使为空也要执行，可能空指针
//
fun main() {
    var info: String? = null
    // info = null

    // 空合并操作符  xxx ?: "原来你是null啊"    "如果xxx等于null，就会执行 ?: 后面的区域"
    println( info ?: "原来你是null啊" )

//    info!!.let {
//        println(  "原来let是null啊" )
//    }

    // let函数 + 空合并操作符
    println(info?.let { "【$it】" } ?: "原来你是null啊2")
}