package com.May.thirteen.operator

//位运算
fun main(){
    val a = 1
    val b = 5

// 操作符实现
    val s = 3 in a .. b     // true,因为3在区间[1,5]之内
    println("s = $s")
    for (index in a .. b){
        print("index = $index \t")
    }

// 操作符重载方式实现
    val t = 3 in a.rangeTo(b)
    println("t = $t")
    for (index in a.rangeTo(b)){
        print("index = $index \t")
    }

}