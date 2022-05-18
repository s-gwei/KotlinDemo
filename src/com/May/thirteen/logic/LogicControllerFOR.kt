package com.May.thirteen.logic

/**
 * kotlin中for的使用
 *
 * 符号（' .. '） 表示递增的循环的另外一种操作
 * 使用符号( '..').
 * 范围：..[n,m]=> 即大于等于n，小于等于m
 * 和until的区别，一是简便性。二是范围的不同。
 *
 */
//fun main(){
    // 循环5次，且步长为1的递增
//    for (i in 0 until 5){
//        print("i => $i \t")
//    }
    // 循环5次，且步长为1的递减
//    for (i in 15 downTo 11){
//        print("i => $i \t")
//    }


    //.. 是大于等于，小于等于
//    print("使用 符号`..`的打印结果\n")
//    for (i in 20 .. 25){
//        print("i => $i \t")
//    }
//
//    println()

    //until是，大于等于，小于
//    print("使用until的打印结果\n")
//    for (i in 20 until 25){
//        print("i => $i \t")
//    }

//}


/**
 * 设置步长
 * step
 *
 * 遍历字符串
 *
 */
fun main(){
//    for (i in 0..16 step 2){
//        print("i => $i \t")
//    }
    for (i in "abcdefg"){
        print("i => $i \t")
    }

    //遍历数组
    var arrayListOne = arrayOf(10,20,30,40,50)
    for (i in arrayListOne){
        print("i => $i \t")
    }

    //使用数组的indices属性遍历
    var arrayListTwo = arrayOf(1,3,5,7,9)
    for (i in arrayListTwo.indices){
        println("arrayListTwo[$i] => " + arrayListTwo[i])
    }

    //使用数组的withIndex()方法遍历
    var arrayListThree = arrayOf(1,3,5,7,9)
    for ((index,value) in arrayListThree.withIndex()){
        println("index => $index \t value => $value")
    }

}