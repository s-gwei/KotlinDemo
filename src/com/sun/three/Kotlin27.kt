package com.sun.three


//匿名函数类型推断

fun main(){

     //匿名函数类型推断为String
     //方法名是冒号，必须指定参数类型和返回类型
    //方法名
    var method1 : (Double, Float, Int) -> String = { v1:Double, v2:Float, v3:Int ->

//       println("v1:$v1,v2:$v2,v3:$v3")
        "v1:$v1,v2:$v2,v3:$v3"
    }
    println(method1(1.1,1.2f,1))

    //返回值类型不确定，可以返回任意类型
    var method2 = { v1:Double,v2:Float,v3:Int ->
        "v1:$v1,v2:$v2,v3:$v3"
        true
    }
//    println(method2(1.1,1.2f,1))

    var method3 ={
        false
    }

//    println(method3())

    var flag = method4(
      "111",
        1
    )
//    println(flag)

    var method5 = { int: Int ->

    }
    println(method5(3))
}
//不定义返回值，返回kotlin.Unit
fun method4(str:String,int:Int) {
//    println("String的值为$str,Int的值为$int")
    false
}
