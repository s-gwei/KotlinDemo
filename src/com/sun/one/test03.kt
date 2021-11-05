package com.sun.one

/**
 * string
 * str.length
 */

fun main(){
//    printStrOne("a")
//    printStrTwo("，举头望明月")

    //比较字符串
    compare()
}
//三引号字符串，表示特定格式的字符串
fun printStrOne(str:String){
    println(
            """窗前明月光，
            疑是地上霜""")
}

fun printStrTwo(str:String){
    //字符串拼接
    var str1 = str.plus("qqqq")
    println("窗前明月光，疑是地上霜${str1}${str1.length}")
}

fun compare(){
    //==和equals都是相同的作用，比较字符串
    var a= "张三"
    var b= "张三"
    println(a==b)
    println(a.equals(b))
}