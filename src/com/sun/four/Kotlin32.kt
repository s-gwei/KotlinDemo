package com.sun.four

//特殊操作符，.let

fun main() {
//    var name:String?= "sungw"
    var name: String?
    name = null
    //
    name?.let {
        println("[$it]")
    }
}
