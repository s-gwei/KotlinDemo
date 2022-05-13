package com.demo.one

fun main() {
    val methodAction : (Int, Int, Int) -> String = { n1, n2, n3 ->
        val number = 24364
        println("$number Derry ,n1:$n1, n2:$n2, n3:$n3")
        "$number Derry ,n1:$n1, n2:$n2, n3:$n3"
    }
    // methodAction.invoke(1,2,3)
    methodAction(1,2,3)

    val methodAction2 : (String) -> String = { "$it Derry" }
    println(methodAction2("DDD"))

    val methodAction3 : (Double) -> String = { "$it Derry2" }
    println(methodAction3(5454.5))
}