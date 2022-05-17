package com.May.thirteen

/**
 * 布尔类型（Boolean）
 * 1、关键字
 * Boolean关键字表示布尔类型，并且其值有true和false
 */
//fun main(){
//    var isNum: Boolean
//    isNum = false
//    println("isNum => $isNum")
//}



/**
 * 2、逻辑操作符（与Java相同）

' || ' => 逻辑或（或者）
' && ' => 逻辑与（并且）
' ! ' => 逻辑非（取反）
 */
//fun main(){
//    /*
//    操作运算符
//    ' || ' => 逻辑或（或者）
//    ' && ' => 逻辑与（并且）
//    ' ! ' => 逻辑非（取反）
// */
//    var a: Boolean = false
//    var b: Boolean = true
//    var result: Boolean
//
///* 逻辑或操作 */
//    if (a || b){
//        result = a || b
//        println("a || b => $result")
//    }
//
///* 逻辑与操作 */
//    if (a && b){
//        result = a && b
//        println("a && b => $result")
//    }
//
///* 逻辑非操作 */
//    result = !a
//    println("!a => $result")
//
//    result = !b
//    println("!b => $result")
//}


/**
 * 三、字符型（Char）
1、关键字

Char为表示字符型，字符变量用单引号（‘ ’）表示。
并且不能直接视为数字，不过可以显式转换为数字。
 */
//fun main(){
//    var char1: Char
//    char1 = 'a'
//  //char1 = 1        => 这句代码会直接出错
//    println("char1 => $char1")
//}

/**
 * 2、显示转换为其他类型
 * 字符型的变量不仅可以转换为数字，
 * 同时也可转换为其他类型
 */
//fun main(){
//    var char1 = 'a'
//    var var1 = char1.toByte()
//    var var2 = char1.toInt()
//    var var3 = char1.toString()
//    var var4 = char1.toFloat()
//    var var5 = char1.toShort()
//    println("var1 => $var1 \n var2 => $var2 \n var3 => $var3 \n var4 => $var4 \n var5 => $var5")
//}

/**
 * 3、字符转义
同Java一样，使用某些特殊的字符时，要使用转义。下列是支持的转义序列：
\t => 表示制表符
\n => 表示换行符
\b => 表示退格键（键盘上的Back建）
\r => 表示键盘上的Enter键
\\ => 表示反斜杠
\' => 表示单引号
\" => 表示双引号
\$ => 表示美元符号，如果不转义在kotlin中就表示变量的引用了
其他的任何字符请使用Unicode转义序列语法。例：'\uFF00'
 */
//fun main(){
//    println("\n  换行符")
//    println("\t  制表符")
//    println(" \b  退格键")
//    println("\r  Enter键同样换行")
//    println('\\')
//    println('\'')
//    println('\"')
//    println('\$')
//    println('\uFF01')
//}

/**
 * 1、关键字
 * String表示字符串类型。其是不可变的。
 * 所以字符串的元素可以通过索引操作的字符：str[index]来访问。可以使用for循环迭代字符串：
 * 其中str[index]中的str为要目标字符串，index为索引
 */
//fun main(){
//    val str: String = "kotlin"
//    println("str => $str")
//
//    //迭代
//    str.forEach {
//        print(it)
//        print("\t")
//    }
//}


/**
 *  字符串字面量

在Kotlin中， 字符串字面量有两种类型：

包含转义字符的字符串 转义包括（\t、\n等）,不包含转义字符串的也同属此类型
包含任意字符的字符串 由三重引号（""" .... """）表示
 */
fun main(){
    // 类型1：
    var str1: String = "hello\t\tkotlin"
    println(str1)
    str1 = "hello kotlin"
    println(str1)

    /**
     * 任意类型都可以被三重引号引用，包括字符串"，这个很好用
     * 但是td不允许直接申明变量，都会声明成常量
     */

// 类型2：
    val str2 = """ fun main(args: Array<String>){
    println("我是三重引号引用的字符串，我可以包含任意字符")
    } """
    println(str2)

    // 类型三，去除特定字符
    val str3: String = """
        
        
        
    > I`m like Kotlin .
    > I`m like Java .
    > I`m like Android .
    > I`m like React-Native.
""".trimMargin("> ").trim()
    println(str3)
}