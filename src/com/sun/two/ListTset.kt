package com.sun.two

fun main(){
    var list = listOf(1,23,4,434,343,3,21,1)

    list?.let {
        println(it)
    }

    println(list.first())

}