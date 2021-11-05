package com.sun.three


//函数参数,函数的声明,it关键字

fun main(){

    val methodAction = {int1:Int,int2:Int,int3:Int ->String
        println(int1+int2+int3)
        "参数1:$int1,参数2:$int2,参数3:$int3"
        true
    }
    println(methodAction(1,2,3))
    //只有一个参数时，it是传过来的参数，当有两个参数时，it就不能使用了（Automatically declared based on the expected type）
    var methodAction1 : (str : String) ->String
    methodAction1  = {
        println(it)
        "222"
    }
    /*
    相当于
    fun methodAction1 :(it :String):String
    {
    return "$it sun"
    }
     */
}