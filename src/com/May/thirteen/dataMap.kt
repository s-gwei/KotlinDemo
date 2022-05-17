package com.May.thirteen

/**
 * map使用Pair(a,b)添加元素
 */
//fun main(){
//    var map = mapOf<Int,Int>()
//    map = map.plus(pair = Pair(1,1))
//    map.forEach { (t, u) ->
//        println("key is $t,value is $u")
//    }
//}

/**
 * 声明一个空map集合
 */
//fun main(){
//    var map = emptyMap<Int,Int>()
//    for(i in 1..100){
//        map = map.plus(Pair(i,i))
//    }
//    map.forEach {
//        println("key is ${it.key},value is ${it.value}")
//    }
//}

/**
 * 声明一个可变map集合.使用put方法添加元素，或者map[i] = i,这样可以不使用Pari包装元素
 */
fun main(){
    var map = mutableMapOf<Int,Int>()
    for(i in 1..100){
        map[i] = i
        map.put(i,i)
    }
        map.forEach {
        println("key is ${it.key},value is ${it.value}")
    }
}