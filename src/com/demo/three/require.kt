package com.demo.three

fun main(){
    var val1: String? = null

//    java.lang.IllegalStateException: Required value was null.
//      check()
//    checkNotNull(val1)

//    java.lang.IllegalArgumentException: Required value was null.
    requireNotNull(val1)

//    var val2: Boolean = false
//    java.lang.IllegalArgumentException: Failed requirement.
//    require(val2)
}