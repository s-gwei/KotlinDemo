package com.sun.two

fun main(){
    //声明map集合
    var map : Map<String,Any> = mutableMapOf<String,Any>()
    //添加元素
    map = map.plus(Pair("sun",25))
    map = map.plus(Pair("chen",27))
    map =  map.plus("aaa" to("222"))
    println(map)

    //获取元素
    println(map["sun"])
    println(map.get("sun"))
    println(map.getOrDefault("sun","不存在"))
    println(map.getOrElse("chen"){
        "不存在"
    })
    //当key不存在会报错的一种获取方式
    println(map.getValue("111 "))

}