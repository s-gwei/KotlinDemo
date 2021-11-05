package com.sun.three

/**
 * 函数类型及隐式返回
 */
fun main(){
    //函数的输入和输出
   var methodAction : (str : String) ->String
    //对函数的实现,不用写return,最后一行自动return
    //只有一个参数时，it是传过来的参数，当有两个参数时，it就不能使用了（Automatically declared based on the expected type）
    methodAction  = {
        println(it)
       "222"
    }
    //对函数的调用
    println(methodAction("111"))
}