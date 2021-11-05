package com.sun.three

/**
 * 匿名函数 lamba
 */
fun main(){
    var len =  "sun".count();
    println(len)

    //it 等价于 sunsss的每个字符，
    len = "sunsss".count{
        it == 's'
    }
    println(len)


}