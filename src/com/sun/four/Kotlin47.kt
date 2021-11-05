package com.sun.four

// TODO 47.Kotlin语言的字符串遍历操作
// "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
fun main() {
    val str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    str.forEach {  c -> // 覆盖默认的it参数名，修改参数名为 c
        // it == str的每一个字符 A B C D ...
        // print("所有的字符是:$it  ")
//        print("所有的字符是:$c  ")
    }

    var  str1 = "sungw,hello"
    //不带下标遍历
    str1.forEach {
//        println("所有的字符是:$it  ")
    }
    //带下标的遍历
    str1.forEachIndexed { index, c ->
        println("字符为$index,$c")
    }
}