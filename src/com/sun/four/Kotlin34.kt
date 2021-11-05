package com.sun.four

//比较if和？.
//如果不需要参数为null的情况，就使用?.,如果参数为null时，需要某些操作，则用if

fun main() {
    var name: String? = null
    name = "DDD"

    // name.capitalize() // name是可空类型的 可能是null，想要使用name，必须给出补救措施

    if (name != null) { // if也算是补救措施，和Java一样了
        val r = name.capitalize()
        println(r)
    } else {
        println("name is null")
    }

    name?.let {
        println(it)
    }


}