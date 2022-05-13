package com.sun.two

fun main(){
    var map: MutableMap<String,Int> = mutableMapOf<String,Int>()
    map.put("111",1)
    map.plus(Pair("111",11))
    map += "111" to 11
    map -= "111"
    map["aaa"] = 888

//    println(map)

    //遍历map
    map.forEach(){
        println("${it.key}，${it.value}")
    }

    map.forEach(){k,v ->
        println("$k,$v")

    }

    for (entry in map) {
        println("${entry.key},${entry.value}")

    }
}