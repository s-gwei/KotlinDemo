package com.sun.three


//函数参数,函数的声明

fun main(){


    val methodAction:(Int,Int,Int)-> String = {int1,int2,int3 ->
       println(int1+int2+int3)
        "参数1:$int1,参数2:$int2,参数3:$int3"
    }
    println(methodAction(1,2,3))
}