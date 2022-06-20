package com.May.thirteen.nullType

//let操作符的作用：当时用符号?.验证的时候忽略掉null
//let的用法：变量?.let{ ... }
fun main(){
    val arrTest : Array<Int?> = arrayOf(1,2,null,3,null,5,6,null)

// 传统写法
//    for (index in arrTest) {
//        if (index == null){
//            continue
//        }
//        println("index => $index")
//    }

// let写法,let写法会把最后一行作为返回值
    arrTest.forEach {
        var result = it?.let {
            println("index => $it")
            it
        }
        println("第$it 每次执行后，返回 result=$result")
    }
}