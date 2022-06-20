package com.May.thirteen.nullType

//Evils其实不是一个操作符，而是evil的复数，而evil的意思在这里可以理解为屏蔽、安全的操作符，这样的操作符有三种：
//
//?: 这个操作符表示在判断一个可空类型时，会返回一个我们自己设定好的默认值.
//!! 这个操作符表示在判断一个可空类型时，会显示的抛出空引用异常（NullPointException）.
//as? 这个操作符表示为安全的类型转换.


// ?:操作符
// 当我们定义了一个可空类型的变量时，如果该变量不为空，则使用，反之使用另外一个不为空的值
fun main(){
    val testStr : String? = null

    var length = 0

// 例： 当testStr不为空时，输出其长度，反之输出-1

// 传统写法
//    length = if (testStr != null) testStr.length else -1

// ?: 写法
    length = testStr?.length ?: testStr.hashCode()

    var a: Int? = null
    var b = a?: 6

    println(length)
    println(b)

//!!操作符可谓是给爱好空引用异常（NullPointException）的开发者使用，
// 因为在使用一个可空类型变量时，在该变量后面加上!!操作符，
// 会显示的抛出NullPointException异常
    val testStr1 : String? = "1"
    println(testStr1!!.length)


//其实这里是指as操作符，表示类型转换，
// 如果不能正常转换的情况下使用as?操作符。
// 当使用as操作符的使用不能正常的转换的情况下会抛出类型转换（ClassCastException）异常，而使用as?操作符则会返回null,但是不会抛出异常
// 会抛出ClassCastException异常
    val num1 : Int? = "Koltin" as? Int
    println("nun1 = $num1")


}


