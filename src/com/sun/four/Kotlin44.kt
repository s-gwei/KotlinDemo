package com.sun.four
// TODO 44.Kotlin语言的split操作

fun main() {
    val jsonText = "Derry,Leo,Lance,Alvin"
    // list 自动类型推断成 list == List<String>
    var list = jsonText.split(",")
    //推测list为数组，
    println(list.size)
    list = list.plus("111")
    println(list.size)
    // 直接输出 list 集合，不解构
    println("分割后的list里面的元素有:$list")

    // C++ 解构  Kt也有解构
//    val (v1, v2, v3, v4) = list
    val (v1, v2, v3) = list
//    println("解构四个只读变量的值是:v1:$v1, v2:$v2, v3:$v3, v4:$v4")
    println("解构四个只读变量的值是:v1:$v1, v2:$v2, v3:$v3,")
}