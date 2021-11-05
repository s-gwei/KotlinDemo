package com.sun.two

//Kotlin中常用集合的使用

fun main(){
    ArratTest()
}

fun ArratTest(){
//    //声明一个空Array
//    var arr1 = emptyArray<Int>()
//    println(arr1.size)
//
//    //声明一个可变集合，添加方式是add
//    var arr2 = mutableListOf<String>()
//    println(arr2.size)
//    arr2.add("1")

    //声明不可变集合,添加方式是plus
    var arr3 = listOf<Int>(1,2,3,1,4,5)
//    println(arr3.size)
    arr3 = arr3.plus(1)
//    println(arr3.size)


    //遍历集合
//    arr3.forEach(){
//        print("$it,")
//    }

//    arr3.forEachIndexed { index, c ->
//        println("$index,$c")
//    }

    arr3.let {
        println(it.first())
    }
}

