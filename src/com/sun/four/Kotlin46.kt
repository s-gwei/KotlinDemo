package com.sun.four

// TODO 46.Kotlin语言的==与===比较操作
//kotlin中==等价于equals是内容的比较，===是引用的比较
fun main() {
    // == 值 内容的比较  相当于Java的equals
    // === 引用的比较

    val name1 : String = "Derry"
    val name2 : String = "Derry"
    val name3 = "ww"

    // 小结：name1.equals(name2)  等价于 name1 == name2  都是属于 值 内容的比较
//    println(name1.equals(name2)) // java
//    println(name1 == name2) // kt

    // 引用的比较，都在字符串常量池中，name1和name2都指向同一块地址
//    println(name1 === name2) // true
//    println(name1 === name3) // false

    // 引用的比较 难度高一点点，
    //name4也指向常量池，但是和name1不是同一块地址，所以是不同的引用
    val name4 = "derry".capitalize() // 修改成"Derry"
    println(name4 == name1)
    println(name4 === name1)
}