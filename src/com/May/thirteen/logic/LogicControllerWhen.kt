package com.May.thirteen.logic

//when语句不仅可以替代掉switch语句，而且比switch语句更加强大
fun main(){
    //when实现swithch功能
    when(5){
        1 -> {
            println("1")
        }
        2 -> println("2")
        3 -> println("3")
        5 -> {
            println("5")
        }
        else -> {
            println("0")
        }
    }

    //和逗号结合使用,相当于switch语句中的不使用break跳转语句
    when(1){
        // 即x = 1,2,3时都输出1。
        1 , 2 , 3 -> {
            println("1")
        }
        5 -> {
            println("5")
        }
        else -> {
            println("0")
        }
    }


    //条件可以使用任意表达式，不仅局限于常量
    var num:Int = 5
    when(num > 5){
        true -> {
            println("num > 5")
        }
        false ->{
            println("num < 5")
        }
        else -> {
            println("num = 5")
        }
    }

    //检查值是否存在于集合或数组中
    var arrayList = arrayOf(1,2,3,4,5)
    when(1){
        in arrayList.toIntArray() -> {
            println("1 存在于 arrayList数组中")
        }
        in 0 .. 10 -> println("1 属于于 0~10 中")
        !in 5 .. 10 -> println("1 不属于 5~10 中")
        else -> {
            println("都错了 哈哈！")
        }
    }

    /**
     * 检查值是否为指定类型的值
     * 操作符
     * 是（is）
     * 不是（!is）
     * 值得注意的是，Kotlin的智能转换可以访问类型的方法和属性
     *
     * message已经确定了数据类型，is的判断是能是这种类型，或者继承这种类型的的子类
     *
     */
    when("abc"){
        is String -> println("abc是一个字符串")
        else -> {
            println("abc不是一个字符串")
        }
    }

// 智能转换
    var a: Int = 2
    when(a){
        !is Int -> {
            println("$a 不是一个Int类型的值")
        }
        else -> {
            a = a.shl(2)
            println("a => $a")
        }
    }

    //不使用表达式的when语句
    var array = arrayOfNulls<String>(3)
    when{
         0>1 -> {
            for (i in array){
                print(" $i \t")
            }
            println()
        }
        else -> {

        }
    }




}