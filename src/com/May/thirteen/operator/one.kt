package com.May.thirteen.operator


//一元操作符
//fun  main(){
//    var a = 1
//    var b = -2
//    var c = true
//    var d = false
//
//// 操作符实现
//    println("+a = ${+a}\t -a = ${-a}\t !c = ${!c}")
//    println("+b = ${+b}\t -b = ${-b}\t !d = ${!d}")
//
//// 操作符重载实现
//    println("+a = ${a.unaryPlus()}\t -a = ${a.unaryMinus()}\t !c = ${c.not()}")
//    println("+b = ${b.unaryPlus()}\t -b = ${b.unaryMinus()}\t !d = ${d.not()}")
//}

//复杂的一元操作符
fun main(){
    var a = 10
    var b = 10
    var c = 10
    var d = 10

// 操作符实现
    println("a++ = ${a++} \t b-- = ${b--} \t ++c = ${++c} \t --d = ${--d}")

// 操作符重载方式实现，或许你看不明白上表中代码，不过这没关系，你只要记住上面前缀与后缀操作的区别就行
    a.also { a.inc() }
    b.also { b.dec() }
    c.inc().also { c = it }
    d.dec().also { d = it }
    println("a = $a \t b = $b \t c = $c \t d = $d")

}