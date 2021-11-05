package com.sun.two

import java.util.*

/**
 * kotlin中的？ , ？. , ?: ,!!, as
 */

fun main(){
//    questionMark(null)

//    questionMarkPrint("1")

    questionMarkColon()
}
//kotlin中的参数，返回值，不能定义为空,?表示可以为空或null
fun questionMark(str:String?):String?{
    var a:String? =null
    println(a+str)
    return null
}
//?.判空操作，数组，list为空调用相应方法，返回null，而不会outprint
//如果为null，返回null，而不往下执行
fun questionMarkPrint(str:String):String?{
    var str: String = "hello,world"
    var str1: String? = null
//    println(str?.length)
//    println(str1?.length)

    //声明List，循环遍历
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // 输出 Kotlin 并忽略 null
    }

    var map : Map<String, String> = mapOf(
        pair = Pair("1","1")
    )
    for (item in map) {
        item?.let { println(it.key) } // 输出 Kotlin 并忽略 null
    }
    return null
}

//?: 三元运算符 如果 ?: 左侧表达式为空，则返回右侧表达式，否则返回左侧表达式。 请注意，当且仅当左侧为空时，才会对右侧表达式求值。
fun questionMarkColon(){
    var b: String? =null
    var l =b?.length ?: 1
    println(l)
}