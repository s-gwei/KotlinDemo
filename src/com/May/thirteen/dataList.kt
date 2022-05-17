package com.May.thirteen

//声明一个List,这个list是不可变的集合，但是可以通过plus方法，创建新集合,并且添加元素
//fun main(){
//    var list = listOf<Int>(10)
//    for (i in 1..100){
//        list =  list.plus(i)
//    }
//    list.forEach {
//        println(it)
//    }
//}

//声明一个空List,还是同样的方式添加元素
//fun main(){
//    var list = emptyList<Int>()
//        for (i in 1..100){
//        list =  list.plus(i)
//    }
//    list.forEach {
//        println(it)
//    }
//}

/**
 *声明一个可变数组,使用add的方式添加元素
 *声明一个mutableListOf,使用plus添加元素，不能再赋值给原集合，因为mutableListOf和list不是一种类型的数据
 * command+shift+o查找文件
 */
fun main(){
    var list = mutableListOf<Int>()
    for (i in 1..100){
        list.add(i)
    }
    for (i in 100..1000){
        list.plus(i)
    }
    list.forEach {
        println(it)
    }
}