import pers.LazySingleton
import pers.Singleton

// 在Kotlin中使用单例模式
fun main(args: Array<String>) {
    println("Hello World!")
    Singleton.doSomething() // 像调用静态方法一样，调用单例类中的方法

    LazySingleton.getInstance()
}