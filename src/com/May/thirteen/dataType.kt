package com.May.thirteen

/**
 * Kotlin中的数字的内置类型（接近与Java），其关键字为：
 * Byte=> 字节 => 8位
 * Short => 短整型 => 16位
 * Int => 整型 => 32位
 * Long => 长整型 => 64位
 * Float => 浮点型 => 32位
 * Double => 双精度浮点型 => 64位
 * Boolean => 布尔类型 =>
 */
//fun main(){
//    var a: Byte = 2
//    var b: Short = 2
//    var c: Int = 2
//    var d: Long = 2L         //长整型由大写字母L标记
//    var e: Float = 2f        //单精度浮点型由小写字母f或大写字符F标记
//    var f: Double = 2.0
//    println(" a => $a \n b => $b \n c => $c \n d => $d \n e => $e \n f => $f")
//}



/**2、进制数
 * 二进制数
 * 八进制数（Kotlin不支持）
 * 十进制数
 * 十六进制数
 */
//fun main(){
//    var g = 0x0F            //十六进制数
//    var h = 0b00001011      //二进制数
//    var k = 123             //十进制数
//// ps：Kotlin不支持八进制数
//    println(" g => $g \n h => $h \n k => $k ");
//}

/**
 * 3、数字类型字面常量的下划线
 * 作用：分割数字进行分组，使数字常量更易读
 * "_"用来分割数值，更便于识别,但是不能加在开头和结尾
 */
//fun main(){
//    val oneMillion = 1_____332434_9
//    val creditCardNumber = 1234_5678_9012_3456L
//    val socialSecurityNumber = 999_99_9999L
//    val hexBytes = 0xFF_EC_DE_5E
//    val bytes = 0b11010010_01101001_10010100_10010010
//
//    println("oneMillion => $oneMillion")
//    println("creditCardNumber => $creditCardNumber")
//    println("socialSecurityNumber => $socialSecurityNumber")
//    println("hexBytes => $hexBytes")
//    println("bytes => $bytes")
//}


/**
 * 4、装箱与拆箱
 * 装箱与拆箱
 * 在Kotlin中，存在数字的装箱，但是不存在拆箱。因为Kotlin是没有基本数据类型的，
 * Kotlin是万般皆对象的原则。故不存在和Java中的类似int是数据类型，Integer是整型的引用类型。
 * 在Kotlin中要实现装箱操作。首先要了解可空引用。即类似Int?(只限数值类型)这样的。
 *
 *
 * 两个数值的比较
 * 判断两个数值是否相等（==）,判断两个数值在内存中的地址是否相等（===）,
 * 其实上面的装箱操作之后其内存中的地址根据其数据类型的数值范围而定。
 */
//fun main(){
//    val numValue: Int? = 123
//    //装箱的过程，其实装箱之后其值是没有变化的
//    val numValueBox: Int? = numValue
//    println("装箱后： numValueBox => $numValue")
//}

//fun main(){
//    val numValue: Int = 195412123
//    val numValueBox: Int? = 195412123
//
//    /*
//        比较两个数字
//     */
//    var result: Boolean
//    result = numValue == numValueBox
//    println("numValue == numValueBox => $result")  // => true,其值是相等的
//
//    var result1 = numValue === numValueBox
//    /*
//      上面定义的变量是Int类型，大于127其内存地址不同，反之则相同。
//      这是`kotlin`的缓存策略导致的，而缓存的范围是` -128 ~ 127 `。
//      故，下面的打印为false
//    */
//    println("numValue === numValueBox => $result1")
//    /**
//     * 上面的定义是错的，声明数值大小和数值内存无关，两个相同的数值，其内存地址肯定相同
//     * 这里与java一致，所以使用字符串或者对象测试内存地址,
//     * 相同的字符串，内存地址一致
//     */
//    val str1 = "hello world"
//    val str2 = "hello world"
//    val result2 = str1 === str2
//    println("numValue === numValueBox => $result2")
//    /**
//     * 用另一种方式声明字符串，StringBuffer("")
//     * 相同的字符串，内存地址不同
//     */
//    val str3 = StringBuffer("hello world")
//    val str4 = StringBuffer("hello world")
//    val result3 = str3 === str4
//    println("numValue === numValueBox => $result3")
//
//}



/**
 * 5、转换
显式转换
较小的类型不会被隐式转换为更大的类型，故而系统提供了显式转换。提供的显式转换方法如下：
toByte() => 转换为字节型
toShort() => 转换为短整型
toInt() => 转换为整型
toLong() => 转换为长整型
toFloat() => 转换为浮点型
toDouble() => 转换为双精度浮点型
toChar() => 转换为字符型
toString() => 转换为字符串型
 */
//fun main(){
//    var numA: Int = 589
//    println(numA.toByte())
//    println(numA.toShort())
//    println(numA.toInt())
//    println(numA.toLong())
//    println(numA.toFloat())
//    println(numA.toDouble())
//    println(numA.toChar())
//    println(numA.toString())
//
//    // 30L + 12 -> Long + Int => Long
//    val num = 30L + 12
//    print(num)
//}

/**
 * 6、位运算符
Kotlin中对于按位操作，和Java是有很大的差别的。Kotlin中没有特殊的字符，但是只能命名为可以以中缀形式调用的函数，下列是按位操作的完整列表(仅适用于整形（Int）和长整形（Long）)：
shl(bits) => 有符号向左移 (类似Java的<<)
shr(bits) => 有符号向右移 (类似Java的>>)
ushr(bits) => 无符号向右移 (类似Java的>>>)
and(bits) => 位运算符 and (同Java中的按位与)
or(bits) => 位运算符 or (同Java中的按位或)
xor(bits) => 位运算符 xor (同Java中的按位异或)
inv() => 位运算符 按位取反 (同Java中的按位取反)

位运算符
支持序列如下：shl、shr、ushr、and、or、xor
 *
 */
fun main(){
    var operaNum: Int = 4

    var shlOperaNum = operaNum shl(2)
    var shrOperaNum = operaNum shr(2)
    var ushrOperaNum = operaNum ushr(2)
    var andOperaNum = operaNum and(2)
    var orOperaNum = operaNum or(2)
    var xorOperaNum = operaNum xor(2)
    var invOperaNum = operaNum.inv()

    println("shlOperaNum => $shlOperaNum \n " +
            "shrOperaNum => $shrOperaNum \n " +
            "ushrOperaNum => $ushrOperaNum \n " +
            "andOperaNum => $andOperaNum \n " +
            "orOperaNum => $orOperaNum \n " +
            "xorOperaNum => $xorOperaNum \n " +
            "invOperaNum => $invOperaNum")
}