package com.May.thirteen

/**
 * 1、arrayOf()

创建一个数组，参数是一个可变参数的泛型对象
 */
fun main(){
//    var arr1 = arrayOf(1,2,3,4,5) //等价于[1,2,3,4,5]
//    for (v in arr1){
//        print(v)
//        print("\t")
//    }
//
//    var arr2 = arrayOf("0","2","3",'a',32.3f)
//    for (v in arr2){
//        print(v)
//        print("\t")
//    }
//
//    var arr3  = emptyArray<String>()
//    arr3[1] = "a"
//    arr3.forEach {
//        print(it)
//    }

    //声明空数组
//    var arr4 = IntArray(9)
//    arr4.set(0, 1)
//    println()
//    arr4.forEach {
//        println(it)
//    }

    //声明一个固定长度的数组
//    var intArr = IntArray(100)
//    for(i in 1..100){
//        intArr[i-1] = i
//    }
//    intArr.forEach {
//        println(it)
//    }

    //声明固定长度，任意类型的数组
    var strArr = arrayOfNulls<Boolean>(100)
    var flag = false
    for(i in 1..100){
        flag = !flag
        strArr[i-1] = flag
    }
    strArr.forEach {
        println(it)
    }
}


