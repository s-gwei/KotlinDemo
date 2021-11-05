package com.sun.four

//todo42,Kotlin语言的先决条件函数
fun main() {
    var value1: String ? = null
    var value2: Boolean = false

    //kotlin自带的函数，检查变量是否为null
//     checkNotNull(value1) // java.lang.IllegalStateException: Required value was null.

//     requireNotNull(value1) // java.lang.IllegalArgumentException: Required value was null.

    require(value2) // java.lang.IllegalArgumentException: Failed requirement.
}