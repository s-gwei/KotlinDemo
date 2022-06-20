package com.May.thirteen.nullType

//定义一个可空类型的变量的格式为：修饰符 变量名 ： 类型? = 值
//这里为了演示，定义变量和定义可空变量的区别，会提到定义变量的代码。
//fun main(){
//    // 定义一个不可为空的变量，用var修饰的变量可以被重新赋值，用val修饰的变量则不能，但是不能赋值为null
//    var a : Int = 12
//    val b : Int = 13
//
//    a = 20
//// a = null 不能复制为null
//// b = 20   不能被重新赋值
//
//    if(a == null){
//        // 这样的判断毫无意义，因为变量a永远不可能null
//    }
//
///*
//    定义可空类型的变量,即变量可以被赋值为null
//    定义格式为：修饰符 变量名 ： 类型? = 值
//*/
//    var nullA : Int? = 12
//    val nullB : Int? = 13
//
//    nullA = null
//
//    if(nullA == null) {
//        println("nullA = $nullA")
//    }
//}


//判断可空类型的两种使用方式

//if...else...判断
//fun main(){
//    var str : String? = "123456"
//    str = null
//
//    if (str == null){
//        println("变量str为空")
//    }else{
//        println("str.length => ${str.length}")
//    }
//
//}

//使用？.判断
//该符号的用法为：可空类型变量?.属性/方法。如果可空类型变量为null时，返回null
//这种用法大量用于链式操作的用法中，能有效避免空引用异常（NullPointException），因为只要链式其中的一个为null，则整个表达式都为null
//fun main(){
//    var str : String? = "123456"
//    str = null
//
//    println(str?.length)   // 当变量str为null时，会返回空(null)
//}


fun main(args: Array<String>) {
    val builder : Test.Builder? = Test.Builder().setName("Lily")?.setSex("nv")?.setAge(10)
    println(builder.toString())
}

class Test{

    //内部类？
    class Builder{
        private var name : String? = null
        private var age : Int?= null
        private var sex : String? = null

        fun setName(name : String) : Builder?{
            this.name = name
            return this
        }

        fun setAge(age : Int) : Builder?{
            this.age = age
            return this
        }

        fun setSex(sex: String?) : Builder?{
            this.sex = sex
            return this
        }

        override fun toString(): String {
            return "Builder(name=$name, age=$age, sex=$sex)"
        }
    }
}



