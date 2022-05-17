package com.May.thirteen

//emptySet(): Set - 创建一个空的只读Set,往里面添加元素
//fun main(){
//    var set1 = emptySet<String>()
//    for(i in 1..100){
//        set1.plus("$i")
//    }
//    set1.forEach{
//        println(it)
//    }
//    set1.size
//    set1.isEmpty()
//}

//创建一个Set
//fun main(){
//    var set2 = setOf<String>()
//    for(i in 1..100){
//        set2 = set2.plus("$i")
//    }
//    set2.forEach{
//        println(it)
//    }
//}


/**
 * 创建可变Set集合，可以直接用add添加元素
 * plus方法返回一个列表，其中包含原始集合的所有元素，相当于创建一个新的集合，并且，原集合是不变的，新集合需要重新用变量接收
 * add() 只需添加一个元素并返回 bool。
 *
 */
fun main(){
    var set2 = mutableSetOf<Int>()
    for(i in 1..100){
        set2.add(i)
    }
    for(i in 1..100){
         set2.plus(i)
    }
    set2.forEach{
        println(it.hashCode())
    }
    var Set3 = HashSet<Int>()
    Set3.add(1)
}