package com.sun.three


//lambda学习

fun main(){

    //匿名函数==lambda
    var addResultMethod ={ number1 :Int ,number2 : Int ->
         "两数相加的结果是:${number1+number2}"
     }
    println(addResultMethod(1,2))

    //返回类型可能是String，也可能是Int
    //返回类型是Any类型类似Object，
    //lambda表达式的参数时Int，lambda的表达式的结果是String或者Int
    var weekResultMethod = { number:Int ->
        when(number){
            1 -> "星期一"
            else -> -1
        }
    }
    println(weekResultMethod(11))
}
