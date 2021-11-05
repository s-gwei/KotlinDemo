package com.sun.four

const val INFO = "Derry is Success Result"

// TODO 43.Kotlin语言的substring
fun main() {
    val indexOf = INFO.indexOf('t')
    println(INFO.substring(0, indexOf))
    println(INFO.substring(0 until indexOf)) // KT基本上用此方式： 0 until indexOf
}