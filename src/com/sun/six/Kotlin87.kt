package com.sun.six

//class Kotlin87 {
object  Kotlin87{
    /* object 对象
    类背后做了什么事情


        public static final KtBase87 INSTANCE;

        private KtBase87() {} // 主构造废除一样的效果

        public final void show() {
            String var1 = "我是show函数...";
            ...
            System.out.println(var1);
        }

        // 这个区域是 object 不同点：
        static {
            KtBase87 var0 = new KtBase87();
            INSTANCE = var0;
            String var1 = "KtBase91 init...";
            ...
            System.out.println(var0);
        }

     */

    //构造函数
//    constructor(name: String){
//        println("name+${name}")
//    }
    init {
        println("KtBase91 init...")
    }

    fun show() = println("我是show函数...")
}

// TODO 87.Kotlin语言的对象声明学习
fun main() {
    //类名加（）相当于创建对象
//    var test = Kotlin87("张三")
//    test.show()
    // object KtBase87 既是单例的实例，也是类名
    // 小结：既然是 单例的实例，又是类名，只有一个创建，这就是典型的单例
//    println(Kotlin87) // 背后代码：println(KtBase87.INSTANCE)
//    println(Kotlin87) // 背后代码：println(KtBase87.INSTANCE)
//
//    println(Kotlin87)
//    println(Kotlin87)
//    println(Kotlin87)
//    println(Kotlin87)
//
//    // 背后代码：KtBase87.INSTANCE.show();
//    println(Kotlin87.show())
}