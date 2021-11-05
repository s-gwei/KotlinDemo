package com.sun.one

/**
 * var与常见变量
 * Byte
 * Short
 * Int
 * Long
 * Float
 * Double
 * String
 */
//编译时常量，需要定义在函数之外，不然就是局部变量
const val c = "111"
fun main(){
    var name = "张三"
    println(name)
    name = "李四"
    println(name)


    var i = 18
//    i=9999999999999999999999999999999

    var j: Int = 1111
    j = 21
    println(j)
//    var j = "sungw"




    //指定具体变量类型
    var x: Int = 18
    x= 19
    println(x)

//    i = 9999999999
    var y: Long
    y=999999999999999999

    var s:String = "hello world"

    var a:Long
}