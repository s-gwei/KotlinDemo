package com.sun.four

//非空断言操作，！！不过值是否为null都会执行，但是如果参数为null会报错
fun main() {
    var name: String? = null

    // name.capitalize() // name是可空类型的 可能是null，想要使用name，必须给出补救措施

    // name = "derry"
    // 补救措施  我们已经学习了 ?
    val r = name!!.capitalize() // !! 断言 不管name是不是null，都执行，这个和java一样了
    //capitalize()将字符串首字母大写
    var s = name.capitalize()
    println(s)

    // 结论：规矩：如果百分百能够保证name是有值的，那么才能使用断言 !!， 否则有Java 空指针异常的风险
}