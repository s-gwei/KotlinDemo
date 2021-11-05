package com.sun.two

/**
 *
 * 函数的声明和调用
 */
fun main(){
    var b= test01()
//    println(b)
//    pringStr("sungw")
//    pringStr(null)
    pringStr(name = 12,str = "qq")
}

//声明一个方法
fun test01():Int{
    return 100
}
//string类型的参数不能为null
fun pringStr(str : String,name: Int):String{
    println("hello,"+str)
    return "hello,"+str
}